package com.ericsson.apiprodutos.repositories;

import com.ericsson.apiprodutos.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
