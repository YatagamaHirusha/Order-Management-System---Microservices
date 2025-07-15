package com.hirusha.Order_Service.Service;

import com.hirusha.Order_Service.DTO.OrderRequest;
import com.hirusha.Order_Service.Model.Order;
import com.hirusha.Order_Service.Repository.OrderRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepo orderRepo;

    public Order placeOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrder_date(LocalDateTime.now());
        order.setStatus(orderRequest.status());
        order.setUser_id(orderRequest.user_id());
        order.setProduct_id((orderRequest.product_id()));
        return orderRepo.save(order);
    }

    public List<Order> getAllOrders(){
        return orderRepo.findAll();
    }

    public Order getOrderById(int id){
        return orderRepo.getOrderById(id);
    }

}
