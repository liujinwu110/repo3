package com.itheima.ssm;

import com.itheima.ssm.domain.Orders;
import com.itheima.ssm.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext*.xml")
public class OrderTest {
    @Autowired
    private OrderService orderService;
    @Test
    public void findAllTest(){
        List<Orders> ordersList = orderService.findAll(1,4);
        for (Orders orders : ordersList) {
            System.out.println(orders.getProduct().getCityName());
        }
    }

    @Test
    public void findByIdTest(){
        Orders orders = orderService.findById("5DC6A48DD4E94592AE904930EA866AFA");
        System.out.println(orders.getProduct().getCityName());
    }
}

