package org.example.tempshop.dto.adminDto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddCategoryDto {
    @NotBlank(message = "Category name cannot be null")
    private String categoryType;
}
