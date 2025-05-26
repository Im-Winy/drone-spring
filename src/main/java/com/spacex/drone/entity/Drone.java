package com.spacex.drone.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="DRONE")
public class Drone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DRONE")
	private Long idDrone;
	
	@Column(name="MODELE")
	private String modele;
	
	@Column(name="POIDS")
	private double poids;
	
	@Column(name="PORTEE_MAX")
	private double porteeMaximale;
	
	@Column(name="CAPACITE_BATTERIE")
	private int capaciteBatterie;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_CAMERA", referencedColumnName = "ID_CAMERA")
    private Camera camera;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_MODULE_GPS", referencedColumnName = "ID_MODULE_GPS")
    private GPSModule gpsModule;

    @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_CONTROLEUR_VOL", referencedColumnName = "ID_CONTROLEUR_VOL")
    private FlightController flightController;

	public Drone() {
		super();
	}

	public Drone(Long idDrone, String modele, double poids, double porteeMaximale, int capaciteBatterie, Camera camera,
			GPSModule gpsModule, FlightController flightController) {
		super();
		this.idDrone = idDrone;
		this.modele = modele;
		this.poids = poids;
		this.porteeMaximale = porteeMaximale;
		this.capaciteBatterie = capaciteBatterie;
		this.camera = camera;
		this.gpsModule = gpsModule;
		this.flightController = flightController;
	}

	public Long getIdDrone() {
		return idDrone;
	}

	public void setIdDrone(Long idDrone) {
		this.idDrone = idDrone;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public double getPorteeMaximale() {
		return porteeMaximale;
	}

	public void setPorteeMaximale(double porteeMaximale) {
		this.porteeMaximale = porteeMaximale;
	}

	public int getCapaciteBatterie() {
		return capaciteBatterie;
	}

	public void setCapaciteBatterie(int capaciteBatterie) {
		this.capaciteBatterie = capaciteBatterie;
	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	public GPSModule getGpsModule() {
		return gpsModule;
	}

	public void setGpsModule(GPSModule gpsModule) {
		this.gpsModule = gpsModule;
	}

	public FlightController getFlightController() {
		return flightController;
	}

	public void setFlightController(FlightController flightController) {
		this.flightController = flightController;
	}
	
}
