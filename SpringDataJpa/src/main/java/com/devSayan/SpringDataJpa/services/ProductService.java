package com.devSayan.SpringDataJpa.services;

import com.devSayan.SpringDataJpa.dtos.ProductDTO;
import com.devSayan.SpringDataJpa.entities.Product;
import com.devSayan.SpringDataJpa.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    public ProductDTO postProduct(ProductDTO productDTO){
        Product product = modelMapper.map(productDTO, Product.class);
        Product savedProduct = productRepository.save(product);
        return modelMapper.map(savedProduct,ProductDTO.class);
    }
}
