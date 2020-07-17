package com.honeywell.user.login.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Session {
    private int sessionId;
    private String userame;
    private String token;
}
