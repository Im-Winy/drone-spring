package com.spacex.drone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="MODULE_GPS")
public class GPSModule {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_MODULE_GPS")
    private Long idGPSModule;

	@Column(name="LATITUDE")
    private double latitude;

	@Column(name="LONGITUDE")
    private double longitude;

	@Column(name="ALTITUDE")
    private double altitude;
	public GPSModule() {
		super();
	}

	public GPSModule(Long idGPSModule, double latitude, double longitude, double altitude) {
		super();
		this.idGPSModule = idGPSModule;
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
	}

	public Long getIdGPSModule() {
		return idGPSModule;
	}

	public void setIdGPSModule(Long idGPSModule) {
		this.idGPSModule = idGPSModule;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	
}
