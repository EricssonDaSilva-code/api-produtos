package com.ericsson.apiprodutos.repositories;

import com.ericsson.apiprodutos.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
