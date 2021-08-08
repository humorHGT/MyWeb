package com.humor.myweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int userid;
    private String username;
    private String userpassword;
    private String usersex;
}
