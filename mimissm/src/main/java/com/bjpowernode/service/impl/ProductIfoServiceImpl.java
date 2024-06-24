package com.bjpowernode.service.impl;

import com.bjpowernode.mapper.ProductInfoMapper;
import com.bjpowernode.pojo.ProductInfo;
import com.bjpowernode.pojo.ProductInfoExample;
import com.bjpowernode.service.ProductIfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductIfoServiceImpl implements ProductIfoService {
    //切记：业务逻辑层一定有数据访问层的对象
   @Autowired
    ProductInfoMapper productInfoMapper;
    @Override
    public List<ProductInfo> getAll() {

        return productInfoMapper.selectByExample(new ProductInfoExample());
    }
    //SELECT * FROM product_info LIMIT 起始记录数=((当前页-1)*每页的条数)，每页取几条
    //SELECT * FROM product_info LIMIT 5,5
    @Override
    public PageInfo splitPage(int pageNum, int pageSize) {
        //分页插件使用PageHelper完成分页配置
        PageHelper.startPage(pageNum,pageSize);
        //进行PageIfo的数据封装
        //进行有条件的查询操作，必须要创建ProductInfoExample
        ProductInfoExample example = new ProductInfoExample();
        //设置排序，按照主键降序排序。
        //SELECT * FROM product_info ORDER BY p_id DESC
        example.setOrderByClause("p_id desc");
        //设置完排序后，取集合，切记切记：一定在取集合之前，设置PageHelper.startPage(pageNum,pageSize)
        List<ProductInfo> list = productInfoMapper.selectByExample(example);
        //将查询到的集合封装进PageInfo对象中
        PageInfo<ProductInfo> pageInfo = new PageInfo<>(list);
        return pageInfo;

    }

    @Override
    public int save(ProductInfo info) {
        return productInfoMapper.insert(info);
    }
}
