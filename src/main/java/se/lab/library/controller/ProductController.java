package se.lab.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import se.lab.library.entity.Product;
import se.lab.library.service.ProductService;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/allProduct")
    public ResponseEntity getProductList(){
        List<Product> allProduct = productService.getAllProduct();
        return ResponseEntity.ok(allProduct);
    }




    @PostMapping("/save")
    public ResponseEntity save(@RequestBody Product product){
        return ResponseEntity.ok(productService.saveProduct(product));
    }
}
