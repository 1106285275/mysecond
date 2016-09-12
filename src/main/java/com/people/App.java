package com.people;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

import com.people.controller.UserController;
import com.people.controller.ZeroController;

@SpringBootApplication

public class App {
      
    public static void main( String[] args )
    {
        System.out.println( "Hello World ! App!" );
        SpringApplication.run(App.class, args);
    }
}
