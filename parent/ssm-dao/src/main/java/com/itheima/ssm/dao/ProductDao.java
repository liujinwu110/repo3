package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProductDao {
//    @Select("select * from product")
    List<Product> findAll();

    void save(Product product);
}
