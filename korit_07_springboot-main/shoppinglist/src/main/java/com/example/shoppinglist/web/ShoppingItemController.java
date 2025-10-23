package com.example.shoppinglist.web;

import com.example.shoppinglist.Entity.ShoppingItem;
import com.example.shoppinglist.service.ShoppingItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class ShoppingItemController {
    private final ShoppingItemService shoppingItemService;

    @GetMapping("/api/items")
    public List<ShoppingItem> getShoppingItems() {
        return shoppingItemService.getShoppingItem();
    }

}
