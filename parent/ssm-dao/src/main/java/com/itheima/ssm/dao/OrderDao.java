package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Orders;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderDao {
    /**
     * 查询所有订单
     * @return
     */
    List<Orders> findAll();

    /**
     * 根据Id查询订单详情
     * @param id
     * @return
     */
    Orders findById(@Param("id") String id);
}
