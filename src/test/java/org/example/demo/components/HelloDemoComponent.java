package org.example.demo.components;

import org.springframework.boot.test.context.TestComponent;
import org.springframework.stereotype.Component;


@TestComponent
public class HelloDemoComponent {

    public String getHello(){
        return "Hello";
    }
}
