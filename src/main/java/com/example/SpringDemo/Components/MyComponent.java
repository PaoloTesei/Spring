package com.example.SpringDemo.Components;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class MyComponent {

    private final String myComponentName;

    public MyComponent() {
        this.myComponentName = "Paolo";
    }

    public String getMyComponentName() {
        return myComponentName;
    }
}