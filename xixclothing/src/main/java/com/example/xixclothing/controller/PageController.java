package com.example.xixclothing.controller;


import com.example.xixclothing.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @Autowired
    private ProductService productService;

    @GetMapping({"/", "/home", "/index", "/index.html"})
    public String showHomePage(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "index";
    }

    @GetMapping({"/products", "/products.html"})
    public String showProductsPage(Model model) {
//        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }

    @GetMapping({"/cart", "/cart.html"})
    public String showCartPage() {
        return "cart";
    }

    @GetMapping({"/contact", "/contact.html"})
    public String showContactPage() {
        return "contact";
    }

    @GetMapping({"/add-product", "admin", "/add-product.html"})
    public String showAdminPage() {
        return "add-product";
    }

}
