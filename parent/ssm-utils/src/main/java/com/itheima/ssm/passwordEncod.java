package com.itheima.ssm;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class passwordEncod {
    public static String passwordEncod(String password){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder.encode(password);
    }


    public static void main(String[] args) {
        String s = passwordEncod("234");
        System.out.println(s);
    }
}
