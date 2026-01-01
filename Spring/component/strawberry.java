package com.example.RestAPI.component;

import com.example.RestAPI.interfaces.syrup;
import org.springframework.stereotype.Component;

@Component
public class strawberry implements syrup {

    @Override
    public String getsyrupType() {
        System.out.println("strawberry syrup");
        return "strawberry syrup";
    }
}
