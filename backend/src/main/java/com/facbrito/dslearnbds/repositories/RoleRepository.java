package com.facbrito.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facbrito.dslearnbds.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
