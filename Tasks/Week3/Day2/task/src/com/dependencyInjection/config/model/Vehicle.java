
package com.dependencyInjection.config.model;


import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Component
public class  Vehicle {
    private String type;
    private String brand;

    public Vehicle( String type,String brand) {
        this.brand = brand;
        this.type = type;
    }
}
