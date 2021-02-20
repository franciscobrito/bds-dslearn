package com.facbrito.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facbrito.dslearnbds.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
