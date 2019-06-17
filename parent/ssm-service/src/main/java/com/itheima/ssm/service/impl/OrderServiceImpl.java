package com.itheima.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.ssm.dao.OrderDao;
import com.itheima.ssm.dao.ProductDao;
import com.itheima.ssm.dao.TravellerDao;
import com.itheima.ssm.domain.Orders;
import com.itheima.ssm.domain.Product;
import com.itheima.ssm.domain.Traveller;
import com.itheima.ssm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderServie")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
   // @Autowired
   //private TravellerDao travellerDao;
   // @Autowired
    //private ProductDao productDao;
    @Override
    public List<Orders> findAll(int page,int size) {
        PageHelper.startPage(page,size);
        return orderDao.findAll();
    }

    @Override
    public Orders findById(String id) {
        //List<Traveller> travellerList = travellerDao.findById(id);
        Orders orders = orderDao.findById(id);
        //Product product = productDao.findById(id);
       //orders.setTravellerList(travellerList);
        //orders.setProduct(product);
        return orders;
    }


}
