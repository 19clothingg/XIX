package com.example.xixclothing.controller;


import com.example.xixclothing.entity.Product;
import com.example.xixclothing.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private ProductService productService;

    @GetMapping("/add-product")
    public String showAddProductForm(Model model) {
        model.addAttribute("product", new Product());
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "add-product";
    }

    @PostMapping("/add-product")
    public String addProduct(@ModelAttribute Product product) {
        productService.saveProduct(product);
        return "redirect:/admin/add-product";
    }

    @GetMapping("/delete-product/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProductById(id);
        return "redirect:/admin/add-product";
    }

    @PostMapping("/update-product/{id}")
    @ResponseBody
    public ResponseEntity<?> updateProduct(@PathVariable("id") String id, @RequestBody Product product) {
        try {
            Long productId = Long.parseLong(id);
            Product updatedProduct = productService.updateProduct(productId, product);
            return updatedProduct != null
                    ? ResponseEntity.ok(updatedProduct)
                    : ResponseEntity.notFound().build();
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body("ID không hợp lệ");
        }
    }


}