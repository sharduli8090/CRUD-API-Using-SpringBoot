package com.example.demo.Controller;


import com.example.demo.Model.CartModel;
import com.example.demo.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController @RequestMapping("/api")
public class CartController {

    @Autowired
    CartService cartService;


    @RequestMapping(value="/product", method= RequestMethod.POST)
    public CartModel createProduct(@RequestBody CartModel prod)
    {
        return cartService.createProduct(prod);
    }



    @RequestMapping(value="/product", method=RequestMethod.GET)
    public List<CartModel> readProduct()
    { return cartService.getProduct(); }


    @RequestMapping(value="/product/{prodId}", method=RequestMethod.GET)
    public Optional<CartModel> readOneProduct(@PathVariable(value = "prodId") Long id)
    { return cartService.getOneProduct(id); }


    @RequestMapping(value="/product/{prodId}", method=RequestMethod.PUT)
    public CartModel readProduct(@PathVariable(value = "prodId") Long id, @RequestBody CartModel cartDetails)  {
        return cartService.updateProduct(id, cartDetails);
    }



    @RequestMapping(value="/product/{prodId}", method=RequestMethod.DELETE)
    public void deleteProduct(@PathVariable(value = "prodId") Long id)
    { cartService.deleteProduct(id); }


}