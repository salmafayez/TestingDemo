package org.example.demo.controller;

import org.example.demo.entity.Category;
import org.example.demo.entity.Product;
import org.example.demo.service.CategoryService;
import org.example.demo.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class CategoryControllerTest {

    @Mock
    private CategoryService categoryService;

    @InjectMocks
    private CategoryController categoryController;

    List<Category> categories = new ArrayList<>();

    @BeforeEach
    public void setUp(){
        categories.add(new Category());
        given(categoryService.getAll()).willReturn(categories);
    }

//    @Test
//    void getAllCategories() {
//
//    }
}