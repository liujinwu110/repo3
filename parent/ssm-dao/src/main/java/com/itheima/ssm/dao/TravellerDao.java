package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Traveller;

import java.util.List;

public interface TravellerDao {
    List<Traveller> findById(String id);
}
