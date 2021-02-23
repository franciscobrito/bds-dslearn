package com.facbrito.dslearnbds.services;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.facbrito.dslearnbds.dto.DeliverRevisionDTO;
import com.facbrito.dslearnbds.entities.Deliver;
import com.facbrito.dslearnbds.observers.DeliverRevisionObserver;
import com.facbrito.dslearnbds.repositories.DeliverRepository;

@Service
public class DeliverService {

	@Autowired
	private DeliverRepository repository;

	private Set<DeliverRevisionObserver> deliverRevisionObservers = new LinkedHashSet<>();

	@Transactional
	public void saveRevision(Long id, DeliverRevisionDTO dto) {
		Deliver deliver = repository.getOne(id);
		deliver.setStatus(dto.getStatus());
		deliver.setFeedback(dto.getFeedback());
		deliver.setCorrectCount(dto.getCorrectCount());
		repository.save(deliver);
		for (DeliverRevisionObserver observer : deliverRevisionObservers) {
			observer.onSaveRevision(deliver);
		}
	}

	public void subscribeDeliverRevisionObserver(DeliverRevisionObserver observer) {
		deliverRevisionObservers.add(observer);
	}

}