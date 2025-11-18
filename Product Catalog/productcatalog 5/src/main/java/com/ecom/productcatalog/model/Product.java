package com.ecom.productcatalog.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import lombok.Data;

@Entity
//Ye annotation JPA (Java Persistence API) ka hai.
//Ye batata hai ki Product ek Entity hai, yani iska ek table database me banega.
//Default rule: class ka naam Product hai to table ka naam
// bhi product banega (lowercase), unless hum @Table(name="...") use karein.
//Entity hone ka matlab: is class ke har field (variable) ek column banega database table me.
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

}