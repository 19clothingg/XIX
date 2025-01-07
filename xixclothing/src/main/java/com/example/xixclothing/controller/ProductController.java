package com.example.xixclothing.controller;

import com.example.xixclothing.entity.Product;
import com.example.xixclothing.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/product-details/{id}")
    public String productDetail(@PathVariable("id") Long id, Model model) {
        Product product = productService.getProductById(id);
        if (product == null) {
            return "error/404";
        }
        model.addAttribute("product", product);
        return "product-details"; //
    }
}
