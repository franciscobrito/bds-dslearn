package com.facbrito.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facbrito.dslearnbds.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
