package com.moveinsync.alerts.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moveinsync.alerts.domain.Alert;
import com.moveinsync.alerts.service.AlertService;

@RestController
@RequestMapping("/alerts")
public class AlertController {

	@Autowired
	private AlertService service;
	
	@PostMapping("/sendAlert")
	public Alert createMovie(@Valid @RequestBody Alert alert) {

		return service.createAlert(alert);

	}
}
