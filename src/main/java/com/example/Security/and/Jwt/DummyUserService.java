package com.example.Security.and.Jwt;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class DummyUserService {

    private Map<String, User> users=new HashMap<>();

    @PostConstruct
    public void initialize(){
        users.put("hakan", new User("hakan", "hakan123",new ArrayList<>()));
        users.put("mehmet", new User("mehmet", "mehmet123",new ArrayList<>()));
        users.put("hasan", new User("hasan", "hasan123  ",new ArrayList<>()));
    }

    public User geyUserByName(String username){
        return users.get(username);
    }
}
