package com.example.SpringDemo.services;

import com.example.SpringDemo.Components.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final MyComponent myComponent;

    @Autowired
    public MyService(MyComponent myComponent) {
        System.out.println("MyService constructor has been called");
        this.myComponent = myComponent;
    }

    public String getName() {
        System.out.println("MyService.getName() method has been called");
        return myComponent.getMyComponentName();
    }
}