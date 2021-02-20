package com.facbrito.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facbrito.dslearnbds.entities.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long> {

}
