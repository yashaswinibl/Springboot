package com.example.RestAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class RestApiApplication implements CommandLineRunner {


        private final cakeBake bake;

        @Autowired
        private    ApplicationContext applicationContext;
//contructor
    public RestApiApplication(cakeBake bake){
        this.bake = bake;
        System.out.println("main method contrcutor");
    }


    public static void main(String[] args) {
        System.out.println("main method");
		SpringApplication.run(RestApiApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        bake.bakeCake();
//        bake1.bakeCake();
        System.out.println(bake.hashCode());
//        System.out.println(bake1.hashCode());
//        System.out.println(bake==bake1);
//        String[] allBeanNames = applicationContext.getBeanDefinitionNames();
//        Map<String, Object> beanMap = new HashMap<>();
        
    }
    }

    //clr



