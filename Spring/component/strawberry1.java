

package com.example.RestAPI.component;

import com.example.RestAPI.interfaces.Frosting;
import org.springframework.stereotype.Component;

@Component
public class strawberry1 implements Frosting {



    @Override
    public String getfrostingType() {
        System.out.println("strawberry frosting");
        return "strawberry frosting";
    }
}
