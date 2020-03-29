package com.ing.carapp.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    private double latitude;
    private double longitude;
}
