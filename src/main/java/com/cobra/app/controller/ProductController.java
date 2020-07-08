package com.cobra.app.controller;

import com.cobra.app.commands.ProductForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    @RequestMapping("/product/new")
    public String newProduct(Model model) {
        model.addAttribute("productForm", new ProductForm());
        return "product/productform";
    }
}
