package com.bjpowernode.service;

import com.bjpowernode.pojo.ProductInfo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ProductIfoService {
    //显示全部商品（不分页）
    List<ProductInfo> getAll();
    //完成分页功能的开发
    PageInfo splitPage(int pageNum,int pageSize);

    int save(ProductInfo info);
}
