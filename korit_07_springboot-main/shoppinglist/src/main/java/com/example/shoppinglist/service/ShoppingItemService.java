package com.example.shoppinglist.service;

import com.example.shoppinglist.Entity.ShoppingItem;
import com.example.shoppinglist.Repository.ShoppingItemRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShoppingItemService {
    private final ShoppingItemRepository shoppingItemRepository;

    //CRUD
    // 전체 사용자 조회
    @Transactional
    public List<ShoppingItem> getShoppingItem() {
        return shoppingItemRepository.findAll();
    }
//
//    // 현재 사용자의 쇼핑 품목
//    @Transactional
//    public List<ShoppingItem> getShoppingItemForCurrent() {
//        //User currentUser =
//        //return userRepository.findByUserId();
//    }
//
//    // 현재 쇼핑 품목을 삭제하는 로직
//    @Transactional
//    public ShoppingItem deleteShoppingItem(Long id) {
//        ShoppingItem shoppingItem = shoppingItemRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("해당 item을 가진 user가 없습니다."));
//        checkUser(shoppingItem);
//        shoppingItemRepository.delete(shoppingItem);
//    }
//
//    // 현재 쇼핑 품목을 전체 삭제하는 로직
//    @Transactional
//    public void deleteAllShoppingItem(){
//        ShoppingItem shoppingItem = getShoppingItemForCurrent();
//        shoppingItemRepository.deleteAllShoppingItem(shoppingItem, true);
//    }

}
