package com.example.Backendservices;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Order {
    private int id;
    private String name;
    private int quantity;
    private long price;
}
