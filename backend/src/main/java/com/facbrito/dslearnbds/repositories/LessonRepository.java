package com.facbrito.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facbrito.dslearnbds.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long> {

}
