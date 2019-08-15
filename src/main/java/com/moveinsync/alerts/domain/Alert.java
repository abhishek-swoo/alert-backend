package com.moveinsync.alerts.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "alert_info")
@EntityListeners(AuditingEntityListener.class)
public class Alert {

	@Id
	@Column(name = "id", nullable = false)
	private long id;
	
	@Column(name = "user_id", nullable = false)
	private long user_id;
	

	@Column(name = "alert_type", nullable = false)
	private String alert_type;

	@Column(name = "generation_time", nullable = false)
	private long generation_time;

	@Column(name = "clear_time", nullable = false)
	private long clear_time;

	@Column(name = "status", nullable = false)
	private String status;

	@Column(name = "description", nullable = false)
	private String description;

	public long getId() {
		return id;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAlert_type() {
		return alert_type;
	}

	public void setAlert_type(String alert_type) {
		this.alert_type = alert_type;
	}
	

	public long getGeneration_time() {
		return generation_time;
	}

	public void setGeneration_time(long generation_time) {
		this.generation_time = generation_time;
	}

	public long getClear_time() {
		return clear_time;
	}

	public void setClear_time(long clear_time) {
		this.clear_time = clear_time;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

}
