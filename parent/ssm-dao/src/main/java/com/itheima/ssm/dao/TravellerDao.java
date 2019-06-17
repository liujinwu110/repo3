package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Traveller;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TravellerDao {
    List<Traveller> findById(String id);
}
