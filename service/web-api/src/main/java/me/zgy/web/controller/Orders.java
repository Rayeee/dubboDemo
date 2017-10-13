package me.zgy.web.controller;

import me.zgy.order.dto.OrderDto;
import me.zgy.order.service.OrderService;
import me.zgy.user.model.Addr;
import me.zgy.user.service.UserService;
import me.zgy.web.dto.OrderCreateResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author: haolin
 * Email:  haolin.h0@gmail.com
 */
@RestController
@RequestMapping("/api/orders")
public class Orders {

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public OrderCreateResp create(){

        OrderDto orderDto = orderService.create(1L, 1000);

        List<Addr> addrs = userService.myAddrs(1L);

        return new OrderCreateResp(orderDto, addrs);
    }
}
