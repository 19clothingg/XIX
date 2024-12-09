package com.example.xixclothing.service;


import com.example.xixclothing.entity.Product;
import com.example.xixclothing.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    // Lấy tất cả sản phẩm và sắp xếp theo ID giảm dần (sản phẩm mới nhất lên đầu)
    public List<Product> getAllProducts() {
        return productRepository.findAll(Sort.by(Sort.Order.desc("id")));
    }
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product updateProduct(Long id, Product product) {
        // Tìm sản phẩm theo ID
        Optional<Product> existingProduct = productRepository.findById(id);
        if (existingProduct.isPresent()) {
            Product updatedProduct = existingProduct.get();
            updatedProduct.setName(product.getName());
            updatedProduct.setPrice(product.getPrice());
            updatedProduct.setDescription(product.getDescription());
            // Cập nhật các trường khác nếu cần
            return productRepository.save(updatedProduct); // Lưu sản phẩm đã cập nhật
        }
        return null; // Trả về null nếu không tìm thấy sản phẩm
    }
}
