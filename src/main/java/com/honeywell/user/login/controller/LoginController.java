package com.honeywell.user.login.controller;

import com.honeywell.user.login.entity.User;
import com.honeywell.user.login.service.LognService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/hw-login/v0/api")
public class LoginController {

    @Autowired
    private LognService loginService;

    @PostMapping("/login")
    public String createUserLogin(@RequestBody User user) throws IOException {
        return loginService.verifyAndLoginUser(user);
    }

    @GetMapping("/logout")
    public String clearExistingSession() {
        return loginService.clearSession();
    }

    @GetMapping("/userInfo")
    public List<User> getAllUsers() {
        return loginService.findAllUsers();
    }
}
