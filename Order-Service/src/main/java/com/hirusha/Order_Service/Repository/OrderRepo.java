package com.hirusha.Order_Service.Repository;

import com.hirusha.Order_Service.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Integer> {
    Order getOrderById(int id);
}
