package com.cydeo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderTest {
    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        //String encodedPassword = passwordEncoder.encode("Abc1");//Admin, Manager
        String encodedPassword = passwordEncoder.encode("Abc2");//Employee

        System.out.println(encodedPassword);
    }
}
