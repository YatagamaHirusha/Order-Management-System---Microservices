package com.hirusha.Order_Service.Service;

import com.hirusha.Order_Service.Client.ProductClient;
import com.hirusha.Order_Service.Client.UserClient;
import com.hirusha.Order_Service.DTO.OrderRequest;
import com.hirusha.Order_Service.DTO.ProductDTO;
import com.hirusha.Order_Service.DTO.UserDTO;
import com.hirusha.Order_Service.Exception.ProductNotFound;
import com.hirusha.Order_Service.Exception.UserNotFound;
import com.hirusha.Order_Service.Model.Order;
import com.hirusha.Order_Service.Repository.OrderRepo;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class OrderService {
    private final OrderRepo orderRepo;
    private UserClient userClient;
    private ProductClient productClient;

    public Order placeOrder(OrderRequest orderRequest){
        ProductDTO product = productClient.getProductById(orderRequest.product_id());
        UserDTO user = userClient.getUserById(orderRequest.user_id());
        if (user == null) throw new UserNotFound();
        if (product == null) throw new ProductNotFound();

        Order order = new Order();

        order.setOrder_date(LocalDateTime.now());
        order.setStatus(orderRequest.status());
        order.setUser_id(orderRequest.user_id());
        order.setProduct_id((orderRequest.product_id()));
        order.setTotal_price(orderRequest.total_price());

        return orderRepo.save(order);
    }

    public List<Order> getAllOrders(){
        return orderRepo.findAll();
    }

    public Order getOrderById(int id){
        return orderRepo.getOrderById(id);
    }

    public void deleteOrder(int id){
        orderRepo.deleteById(id);
    }
}
