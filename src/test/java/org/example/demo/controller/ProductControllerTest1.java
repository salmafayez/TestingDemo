package org.example.demo.controller;

import org.example.demo.entity.Product;
import org.example.demo.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

@ExtendWith(MockitoExtension.class)
public class ProductControllerTest1 {

    @Mock
    private ProductService productService;

    @InjectMocks
    private ProductController productController;

    private List<Product> products = new ArrayList<>();

    private ResponseEntity<List<Product>> responseEntity;

    @BeforeEach
    public void setUp(){
        products.add(new Product());
        given(productService.getAll()).willReturn(products);
    }

    @Test
    public void getAllProducts(){
         //when
         responseEntity = productController.getAllProducts();

         //Then
        then(productService).should().getAll();
        assertThat(products.size()).isEqualTo(1);

    }
}
