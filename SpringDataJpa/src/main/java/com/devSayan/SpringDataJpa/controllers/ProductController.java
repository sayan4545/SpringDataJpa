package com.devSayan.SpringDataJpa.controllers;

import com.devSayan.SpringDataJpa.dtos.ProductDTO;
import com.devSayan.SpringDataJpa.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/post")
    public ResponseEntity<ProductDTO> saveProduct(@RequestBody ProductDTO productDTO){
        productService.postProduct(productDTO);
        return ResponseEntity.ok(productDTO);
    }
}
