package com.ericsson.apiprodutos.Repositories;

import com.ericsson.apiprodutos.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
