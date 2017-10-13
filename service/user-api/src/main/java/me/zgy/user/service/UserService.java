package me.zgy.user.service;


import me.zgy.user.model.Addr;
import me.zgy.user.model.User;

import java.util.List;

/**
 * Author: haolin
 * Email:  haolin.h0@gmail.com
 */
public interface UserService {

   User findById(Long id);

   List<Addr> myAddrs(Long userId);
}
