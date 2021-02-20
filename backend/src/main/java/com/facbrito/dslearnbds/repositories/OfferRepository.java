package com.facbrito.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.facbrito.dslearnbds.entities.Offer;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {

}
