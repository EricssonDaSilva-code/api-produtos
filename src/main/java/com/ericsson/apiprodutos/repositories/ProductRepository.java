package com.ericsson.apiprodutos.repositories;

import com.ericsson.apiprodutos.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
