package se.lab.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.lab.library.entity.Product;
import se.lab.library.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    public Product saveProduct(Product product){
        Product save = productRepository.save(product);
        return save;
    }
}
