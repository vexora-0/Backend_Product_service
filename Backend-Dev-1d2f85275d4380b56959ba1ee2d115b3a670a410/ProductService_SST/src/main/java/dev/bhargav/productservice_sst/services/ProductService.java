package dev.bhargav.productservice_sst.services;

import dev.bhargav.productservice_sst.models.Product;

import java.util.*;

public interface ProductService {
      Product getProductById(Long id);

        List<Product> getAllProducts();
}
