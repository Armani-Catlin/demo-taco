package com.example.demotaco.security;

import com.example.demotaco.domain.User;
import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
public class Registration {
    private String username;
    private String password;
    private String fullname;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;

    public User convertedUser(PasswordEncoder encoder) {
        String hashPash = encoder.encode(password);
        return new User(username, hashPash, fullname, street, city, state, zip, phoneNumber);
    }
}