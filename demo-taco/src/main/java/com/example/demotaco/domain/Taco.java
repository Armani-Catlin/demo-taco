package com.example.demotaco.domain;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Taco {
    @NotBlank
    @Size(min=3, message = "Name must be at least 3 characters long")
    private String name;

    @NotNull(message = "You must have at least 2 ingredients to make a taco")
    @Size(min=2, message = "You must have at least 2 ingredients to make a taco")

    @ManyToMany(targetEntity = Ingredient.class)
    private List<Ingredient> ingredients = new ArrayList<>();

    public void addIngredientToTaco (Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date createdAt;

    @PrePersist
    void createdAt() {
        this.createdAt = new Date();
    }
}