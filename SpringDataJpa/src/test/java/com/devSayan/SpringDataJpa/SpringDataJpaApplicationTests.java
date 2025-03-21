package com.devSayan.SpringDataJpa;

import com.devSayan.SpringDataJpa.entities.Product;
import com.devSayan.SpringDataJpa.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class SpringDataJpaApplicationTests {

	@Autowired
	ProductRepository productRepository;

	@Test
	void contextLoads() {
	}
	@Test
	void testProductRepos(){
		Product product = Product.builder()
				.sku("nestle")
				.title("milk")
				.quantity(90)
				.price(BigDecimal.valueOf(5600))
				.build();
		Product savedProduct = productRepository.save(product);
		System.out.println(savedProduct);
	}
	@Test
	void testRepoget(){
		System.out.println(productRepository.findById(1l).orElse(null));
	}
	@Test
	void getAllProducts(){
		List<Product> allProducts = productRepository.findAll();
//		System.out.println(allProducts);
//		System.out.println("done!!");
	}
	@Test
	void findByTitle(){
		List<Product> products = productRepository.findByTitle("milk");
	}

	@Test
	void findByPrice(){
		List<Product> pr = productRepository.findByPriceGreaterThan(BigDecimal.valueOf(100));
	}
	@Test
	void find(){
		List<Product> pr = productRepository.findByCreatedAtBetween(LocalDateTime.of(2000, 12, 12, 10, 45),LocalDateTime.of(2001,12,1,2,10));
		;
	}
	@Test
	void findAll(){
		List<Product> pr = productRepository.findByCreatedAtAfter(LocalDateTime.of(2022,10,10,10,10));
		System.out.println(pr);
	}

}
