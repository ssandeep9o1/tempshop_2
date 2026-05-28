package org.example.tempshop.dtos.requestDto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ItemRequest {

    @NotBlank(message = "Item name cannot be empty")
    private String itemName;

    @Min(0)
    private int stocks;

    @NotNull(message = "Owner id cannot be empty")
    private Long ownerId;

    @NotNull(message = "Category id cannot be empty")
    private Long categoryId;

}
