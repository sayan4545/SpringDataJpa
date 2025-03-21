package com.devSayan.SpringDataJpa.repositories;

import com.devSayan.SpringDataJpa.entities.Product;
import org.modelmapper.internal.bytebuddy.asm.Advice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    List<Product> findByTitle(String title);
    List<Product> findBySku(String sku);
    List<Product> findByPriceGreaterThan(BigDecimal price);
    List<Product> findByCreatedAtBetween(LocalDateTime startDate, LocalDateTime endDate );
    List<Product> findByCreatedAtAfter(LocalDateTime date);
}
