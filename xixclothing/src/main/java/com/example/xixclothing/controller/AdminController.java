package com.example.xixclothing.controller;


import com.example.xixclothing.entity.Product;
import com.example.xixclothing.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private ProductService productService;

    // Hiển thị form thêm sản phẩm + danh sách sản phẩm
    @GetMapping("/add-product")
    public String showAddProductForm(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("products", productService.getAllProducts()); // Lấy danh sách sản phẩm
        return "add-product";
    }

    // Thêm sản phẩm mới
    @PostMapping("/add-product")
    public String addProduct(@ModelAttribute Product product) {
        productService.saveProduct(product);
        return "redirect:/admin/add-product";
    }

    // Xóa sản phẩm (AJAX hoặc bằng nút delete)
    @GetMapping("/delete-product/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProductById(id); // Xóa sản phẩm dựa trên ID
        return "redirect:/admin/add-product"; // Trả về phản hồi cho AJAX
    }

    // Chỉnh sửa sản phẩm bằng AJAX
    @PostMapping("/update-product")
    @ResponseBody
    public String updateProduct(@RequestBody Product updatedProduct) {
        // Tìm sản phẩm cũ từ database
        Product existingProduct = productService.getProductById(updatedProduct.getId());
        if (existingProduct != null) {
            // Cập nhật thông tin nếu dữ liệu không rỗng
            if (updatedProduct.getName() != null) {
                existingProduct.setName(updatedProduct.getName());
            }
            if (updatedProduct.getPrice() != null) {
                existingProduct.setPrice(updatedProduct.getPrice());
            }
            if (updatedProduct.getDescription() != null) {
                existingProduct.setDescription(updatedProduct.getDescription());
            }
            productService.saveProduct(existingProduct); // Lưu sản phẩm đã cập nhật
        }
        return "redirect:/admin/add-product"; // Trả về phản hồi cho AJAX
    }




}
