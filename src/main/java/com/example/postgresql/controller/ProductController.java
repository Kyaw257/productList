package com.example.postgresql.controller;

import com.example.postgresql.model.Product;
import com.example.postgresql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/showProducts")
    public ModelAndView showProducts() {
        ModelAndView mav = new ModelAndView("product");
        List<Product> list = productRepository.findAll();
        mav.addObject("products",list);
        return mav;
    }

}
