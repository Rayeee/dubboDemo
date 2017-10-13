package me.zgy.user.service;

import autovalue.shaded.com.google.common.common.collect.Lists;
import me.zgy.user.model.Addr;
import me.zgy.user.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: haolin
 * Email:  haolin.h0@gmail.com
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    public User findById(Long id) {

        User user = new User();
        user.setId(id);
        user.setPasswd("");
        user.setUsername("xiaoming");


        return user;
    }

    public List<Addr> myAddrs(Long userId) {
        return Lists.newArrayList(
            new Addr(1L, userId, "Addr" + userId, "Mobile"+userId),
            new Addr(2L, userId, "Addr" + userId, "Mobile"+userId)
        );
    }
}
