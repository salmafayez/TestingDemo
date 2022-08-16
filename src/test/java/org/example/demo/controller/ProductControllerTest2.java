package org.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.example.demo.config.DemoConfiguration;
import org.example.demo.entity.Product;
import org.example.demo.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.reset;

@SpringJUnitConfig(classes = DemoConfiguration.class)
public class ProductControllerTest2 {


    @Autowired(required = true)
    private ProductController productController;

    @Autowired
    private ProductService productService;

    private ResponseEntity<List<Product>> responseEntity;

    @BeforeEach
    public void setUp(){
        given(productService.getAll()).willReturn(  );
    }

    @Test
    public void getAllProducts(){
        responseEntity = productController.getAllProducts();
        assertThat(responseEntity.getBody().size()).isEqualTo(4);
    }
}
