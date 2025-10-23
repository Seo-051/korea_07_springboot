package com.example.shoppinglist.Repository;

import com.example.shoppinglist.Entity.ShoppingItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingItemRepository extends JpaRepository<ShoppingItem, Long> {

}
