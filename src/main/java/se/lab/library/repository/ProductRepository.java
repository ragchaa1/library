package se.lab.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.lab.library.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

