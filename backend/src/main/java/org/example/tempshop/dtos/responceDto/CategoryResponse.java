package org.example.tempshop.dtos.responceDto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CategoryResponse {

    private String categoryType;

    private LocalDateTime createdAt;

    private LocalDateTime updateAt;
}
