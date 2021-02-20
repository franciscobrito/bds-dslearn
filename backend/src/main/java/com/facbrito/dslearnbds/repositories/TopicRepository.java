package com.facbrito.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facbrito.dslearnbds.entities.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {

}
