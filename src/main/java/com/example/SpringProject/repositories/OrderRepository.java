package com.example.SpringProject.repositories;

import com.example.SpringProject.dao.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository {

    Order save(Order order);
}
