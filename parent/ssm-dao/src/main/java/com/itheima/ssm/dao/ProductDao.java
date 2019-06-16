package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProductDao {
//    @Select("select * from product")

    /**
     * 查询所有产品
     * @return
     */
    List<Product> findAll();

    /**
     * 添加产品
     * @param product
     */
    void save(Product product);

    Product findById(String id);
}
