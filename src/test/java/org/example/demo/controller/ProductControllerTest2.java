package org.example.demo.controller;


import lombok.RequiredArgsConstructor;
import org.example.demo.entity.Product;
import org.example.demo.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.http.ResponseEntity;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@RequiredArgsConstructor
@AutoConfigureMockMvc
public class ProductControllerTest2 {

    @SpyBean
    private ProductService productService;

    List<Product> products = new ArrayList<>();
    private ResponseEntity<List<Product>> responseEntity;

    @Autowired
    private MockMvc mvc;

    @BeforeEach
    public void setUp(){
        products.add(new Product());
        products.add(new Product());
        given(productService.getAll()).willReturn(products);
    }

    @Test
    public void getAllProducts() throws Exception {
//        responseEntity = productController.getAllProducts();
//        assertThat(responseEntity.getBody().size()).isEqualTo(2);
        mvc.perform(get("/products"))
                .andExpect(status().isOk());

    }
}
