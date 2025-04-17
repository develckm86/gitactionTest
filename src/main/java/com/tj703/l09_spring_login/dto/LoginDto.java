package com.tj703.l09_spring_login.dto;

import com.tj703.l09_spring_login.entity.User;
import lombok.Getter;
import lombok.Setter;

//{"jwt":"abk3123Fsfasf..."}
@Getter
@Setter
public class LoginDto{
    private String jwt;
    private User user;
}