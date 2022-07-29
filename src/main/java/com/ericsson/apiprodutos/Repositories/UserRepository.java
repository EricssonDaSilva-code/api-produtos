package com.ericsson.apiprodutos.Repositories;

import com.ericsson.apiprodutos.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}