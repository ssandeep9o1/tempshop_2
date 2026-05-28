package org.example.tempshop.repository;

import org.example.tempshop.entity.Items;
import org.example.tempshop.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemsRepository extends JpaRepository<Items, Long> {
    Optional<Items> findByItemName(String name);
}
