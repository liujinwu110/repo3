package com.itheima.ssm.service;

import com.itheima.ssm.domain.Orders;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    /**
     * 查询所有订单
     */
    List<Orders> findAll(int page, int size);


    /**
     * 根据id查询订单详情
     * @param id
     * @return
     */
    Orders findById(String id);
}
