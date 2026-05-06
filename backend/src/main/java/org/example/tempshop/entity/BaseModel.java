package org.example.tempshop.entity;


import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public class BaseModel {

    @CreationTimestamp
    private LocalDateTime created_at;

    @UpdateTimestamp
    private LocalDateTime updated_at;

}
