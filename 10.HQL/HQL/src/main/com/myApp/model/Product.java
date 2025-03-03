package main.com.myApp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "products")
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Product {
    @Id
    @Column(name = "product_id")
    private int id;
    private String name;
    private String description;
    private double price;
    @Column(name = "stock_quantity")
    private int quantity;
    private String manufacturer;
    @Column(name = "production_date")
    private Date productionDate;

    public Product(String name, String description, double price, int quantity, String manufacturer, Date productionDate) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
        this.productionDate = productionDate;
    }
}