package com.example.demotaco.domain;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
public class Taco {
    @NotBlank
    @Size(min=3, message = "Name must be at least 3 characters long")
    private String name;
    @NotNull(message = "You must have at least 2 ingredients to make a taco")
    @Size(min=2, message = "You must have at least 2 ingredients to make a taco")
    private List<String> ingredients;

    private Long id;
    private Date createdAt;
}