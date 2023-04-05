package com.example.demo.Service;

import com.example.demo.Model.CartModel;
import com.example.demo.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {

    @Autowired
    CartRepository cartRepository;

    // CREATE
    public CartModel createProduct(CartModel prod) {
        return cartRepository.save(prod);
    }

    // READ
    public List<CartModel> getProduct() {
        return cartRepository.findAll();
    }

    // READ ONE
    public Optional<CartModel> getOneProduct(Long prodId) {
            return cartRepository.findById(prodId);
    }

    // DELETE
    public void deleteProduct(Long prodId) {
        cartRepository.deleteById(prodId);
    }

    // UPDATE
    public CartModel updateProduct(Long prodId, CartModel cartDetails) {
        CartModel prod = cartRepository.findById(prodId).get();
        prod.setName(cartDetails.getName());
        prod.setDesc(cartDetails.getDesc());
        return cartRepository.save(prod);
    }

}
