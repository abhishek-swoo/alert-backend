package com.moveinsync.alerts.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moveinsync.alerts.domain.Alert;

public interface AlertsRepository extends JpaRepository<Alert, Long>  {

}
