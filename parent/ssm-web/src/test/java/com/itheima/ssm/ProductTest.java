package com.itheima.ssm;

import com.itheima.ssm.dao.ProductDao;
import com.itheima.ssm.domain.Product;
import com.itheima.ssm.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext*.xml")
public class ProductTest {
    @Autowired
    private ProductService productService;
    @Autowired
    private ProductDao productDao;
    @Test
    public void test2(){
        List<Product> productList = productService.findAll();
        for (Product product : productList) {
            System.out.println(product.getDepartureTimeStr());
        }
    }

    @Test
    public void test1(){
      List<Product> productList = productDao.findAll();
       System.out.println(productList);
    }

}
