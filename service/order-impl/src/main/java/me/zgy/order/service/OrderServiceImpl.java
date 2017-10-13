package me.zgy.order.service;

import me.zgy.order.dto.OrderDto;
import me.zgy.order.model.Order;
import me.zgy.user.model.User;
import me.zgy.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: haolin
 * Email:  haolin.h0@gmail.com
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserService userService;

    public OrderDto create(Long userId, Integer amount) {

        // invoke other rpc service
        User user = userService.findById(userId);

        Order order = new Order();
        order.setId(2L);
        order.setAmount(amount);
        order.setBuyerId(user.getId());
        order.setOrderName("测试订单");
        order.setOrderNo("123456");

        OrderDto orderDto = new OrderDto();
        orderDto.setUser(user);
        orderDto.setOrder(order);

        return orderDto;
    }
}
