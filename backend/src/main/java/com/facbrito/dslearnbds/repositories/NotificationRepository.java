package com.facbrito.dslearnbds.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.facbrito.dslearnbds.entities.Notification;
import com.facbrito.dslearnbds.entities.User;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

	@Query("SELECT o FROM Notification o WHERE "
			+ "(o.user = :user) AND "
			+ "(:unreadOnly = false OR o.read = false) "
			+ "ORDER BY o.moment DESC")
	Page<Notification> find(User user, boolean unreadOnly, Pageable pageable);

}
