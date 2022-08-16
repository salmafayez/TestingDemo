package org.example.demo;

import org.example.demo.config.DemoConfiguration;
import org.example.demo.entity.Product;
import org.example.demo.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener;
import org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = {DemoConfiguration.class})
@AutoConfigureMockMvc
@TestExecutionListeners({ MockitoTestExecutionListener.class,
		ResetMocksTestExecutionListener.class })
class DemoApplicationTests {


	@Test
	void testWithMockMvc(@Autowired MockMvc mvc) throws Exception {
		mvc.perform(get("/"))
				.andExpect(status().isOk())
				.andExpect(content().string("Hello World"));
	}

	@Test
	void exampleTest(@Autowired TestRestTemplate restTemplate) {
		String body = restTemplate.getForObject("/", String.class);
		assertThat(body).isEqualTo("Hello World");
	}

}
