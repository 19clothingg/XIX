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

    // Hiển thị form thêm sản phẩm + danh sách sản phẩm
    @GetMapping("/add-product")
    public String showAddProductForm(Model model) {
        model.addAttribute("product", new Product());
        // Lấy danh sách sản phẩm và sắp xếp theo ID giảm dần
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products); // Lấy danh sách sản phẩm
        return "add-product";
    }

    // Thêm sản phẩm mới
    @PostMapping("/add-product")
    public String addProduct(@ModelAttribute Product product) {
        productService.saveProduct(product);
        return "redirect:/admin/add-product";
    }

    // Xóa sản phẩm
    @GetMapping("/delete-product/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProductById(id); // Xóa sản phẩm dựa trên ID
        return "redirect:/admin/add-product"; // Trả về phản hồi cho AJAX
    }

    // Chỉnh sửa sản phẩm
    @PostMapping("/update-product/{id}")
    @ResponseBody
    public ResponseEntity<?> updateProduct(@PathVariable("id") String id, @RequestBody Product product) {
        try {
            Long productId = Long.parseLong(id); // Chuyển đổi từ String sang Long
            Product updatedProduct = productService.updateProduct(productId, product);
            return updatedProduct != null
                    ? ResponseEntity.ok(updatedProduct)
                    : ResponseEntity.notFound().build();
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body("ID không hợp lệ");
        }
    }


}