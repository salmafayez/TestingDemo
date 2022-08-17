package org.example.demo.test;

import org.example.demo.components.HelloDemoComponent;
import org.example.demo.config.DemoConfiguration;
import org.example.demo.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import static org.assertj.core.api.Assertions.assertThat;


@Import(HelloDemoComponent.class)
@SpringBootTest(classes = {DemoConfiguration.class})
public class HelloDemoTest {

    @Autowired
    private HelloDemoComponent helloDemoComponent;

    @Autowired
    private ProductService productService;

    @Test
    public void testGetHello() throws Exception {
        String result = helloDemoComponent.getHello();
        assertThat(result).isEqualTo("Hello");
    }


}
