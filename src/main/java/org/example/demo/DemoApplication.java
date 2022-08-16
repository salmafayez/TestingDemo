package org.example.demo;

import org.example.demo.entity.Category;
import org.example.demo.entity.Product;
import org.example.demo.repo.CategoryRepository;
import org.example.demo.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(){
		return args -> {
			Category category1 = Category.builder().name("category1").build();
			Category category2 = Category.builder().name("category2").build();

			Product product1 = Product.builder().name("product1").price(200.0).build();
			Product product2 = Product.builder().name("product2").price(200.0).build();
			Product product3 = Product.builder().name("product3").price(200.0).build();
			Product product4 = Product.builder().name("product4").price(200.0).build();

			categoryRepository.save(category1);
			categoryRepository.save(category2);

			productRepository.save(product1);
			productRepository.save(product2);
			productRepository.save(product3);
			productRepository.save(product4);

			productRepository.findAll().forEach(System.out::println);
		};
	}

}
