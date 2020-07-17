package com.honeywell.user.login.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Getter
@Setter
public class User {
    private String userName;
    private String password;
}
