package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Orders;

import java.util.List;

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
    Orders findById(String id);
}
