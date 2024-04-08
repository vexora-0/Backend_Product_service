package dev.bhargav.productservice_sst.controllers;


import dev.bhargav.productservice_sst.services.ProductService;
import dev.bhargav.productservice_sst.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// this controller is capable to host HTTP API'S
@RestController
// localhost:8080/products->ProductController


@RequestMapping("/products")
public class ProductController { // waiter
    private ProductService productService;

    ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping ("/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        return  productService.getProductById(id);

    }
    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }




}
