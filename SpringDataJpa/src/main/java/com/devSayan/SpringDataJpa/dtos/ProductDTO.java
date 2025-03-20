package com.devSayan.SpringDataJpa.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ProductDTO {

    private Long id;
    private String sku;
    private String title;
    private int quantity;
    private BigDecimal price;

}
