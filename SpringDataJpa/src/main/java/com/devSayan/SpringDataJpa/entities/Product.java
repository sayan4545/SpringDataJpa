package com.devSayan.SpringDataJpa.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name ="products",
        uniqueConstraints = {
        @UniqueConstraint(columnNames = {"sku"})
        },
        indexes = {@Index(name = ("sku_index"),columnList = "sku")}
)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="sku" , nullable = false)
    private String sku;

    private String title;

    private int quantity;

    private BigDecimal price;

    @CreationTimestamp

    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;


}
