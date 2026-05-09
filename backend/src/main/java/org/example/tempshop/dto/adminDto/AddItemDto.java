package org.example.tempshop.dto.adminDto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AddItemDto {

    @NotBlank(message = "Item name cannot be blank")
    private String itemName;

    @NotNull(message = "Item category cannot be blank")
    private Long categoryId;

    @Min(0)
    private int stocks;

}
