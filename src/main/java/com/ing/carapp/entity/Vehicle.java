package com.ing.carapp.entity;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    private int id;
    private String make;
    private String model;
    private int year_model;
    private BigDecimal price;
    private boolean licensed;
    private String date_added;
}
