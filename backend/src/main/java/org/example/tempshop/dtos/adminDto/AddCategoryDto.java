package org.example.tempshop.dtos.adminDto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddCategoryDto {

    @NotBlank(message = "Category name cannot be null")
    private String categoryType;
}
