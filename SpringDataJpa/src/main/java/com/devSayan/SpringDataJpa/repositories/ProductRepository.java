package com.devSayan.SpringDataJpa.repositories;

import com.devSayan.SpringDataJpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
