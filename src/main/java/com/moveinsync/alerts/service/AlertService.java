package com.moveinsync.alerts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moveinsync.alerts.domain.Alert;
import com.moveinsync.alerts.persistence.AlertsRepository;

@Service
public class AlertService {

	@Autowired
	private AlertsRepository repo;
	
	public Alert createAlert(Alert alert) {
		return repo.save(alert);
	}
}
