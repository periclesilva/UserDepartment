package com.devisuperior.entities.repository;

import com.devisuperior.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
