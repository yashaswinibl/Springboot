package com.example.RestAPI;

import com.example.RestAPI.interfaces.Frosting;
import com.example.RestAPI.interfaces.syrup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Component

//@Scope("prototype")
public class cakeBake {

    private Frosting frosting;
    private syrup syrup;

    @Autowired
    public cakeBake(@Qualifier("chocolate") Frosting frosting, @Qualifier("chocolate1") syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
        System.out.println("this is a contructore");
    }
  public cakeBake(){
      System.out.println("empty constrcutor");
  }

    public void bakeCake(){
        System.out.println("Cake is baking");
        System.out.println(frosting.getfrostingType());
        System.out.println(syrup.getsyrupType());
    }

}
