package com.facbrito.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facbrito.dslearnbds.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
