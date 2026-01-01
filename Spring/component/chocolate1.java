package com.example.RestAPI.component;

import com.example.RestAPI.interfaces.syrup;
import org.springframework.stereotype.Component;

@Component
public class chocolate1 implements syrup {
    @Override
    public String getsyrupType() {
        System.out.println("chocolate syrup");
        return "chocolate syrup";
    }
}
