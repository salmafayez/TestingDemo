package org.example.demo.controller;

import org.springframework.boot.test.context.TestComponent;

@TestComponent
public class HelloDemoComponent {

    public String getHello(){
        return "Hello";
    }
}
