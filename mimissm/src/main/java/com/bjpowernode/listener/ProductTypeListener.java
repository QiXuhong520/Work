package com.bjpowernode.listener;

import com.bjpowernode.pojo.ProductType;
import com.bjpowernode.service.ProductTypeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.List;

@WebListener
public class ProductTypeListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //手工从当前Spring容器中取出ProductTy'peServiceImpl的对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_*.xml");
        ProductTypeService productTypeService = (ProductTypeService) context.getBean("ProductTypeServiceImpl");
        List<ProductType> typeList = productTypeService.getAll();
        //放入全局应用作用域中，供新增页面修改页面、前台的查询功能提供全部商品类别集合
        sce.getServletContext().setAttribute("typeList",typeList);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
