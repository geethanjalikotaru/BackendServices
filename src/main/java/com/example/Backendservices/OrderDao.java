package com.example.Backendservices;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {
   public List<Order> getOrder(){
       return Stream.of(new Order(101,"Mobile",1,30000),
                       new Order(102,"Mobile",1,30000))
               .collect(Collectors.toList());
   }
}

