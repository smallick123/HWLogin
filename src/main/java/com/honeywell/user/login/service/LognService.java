package com.honeywell.user.login.service;

import com.honeywell.user.login.entity.User;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public interface LognService {
    String verifyAndLoginUser(User user) throws IOException;

    String clearSession();

    List<User> findAllUsers();
}
