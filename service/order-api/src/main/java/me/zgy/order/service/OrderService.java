package me.zgy.order.service;


import me.zgy.order.dto.OrderDto;

/**
 * Author: haolin
 * Email:  haolin.h0@gmail.com
 */
public interface OrderService {

    OrderDto create(Long userId, Integer amount);
}
