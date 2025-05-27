package com.spacex.drone.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="CONTROLEUR_VOL")
public class FlightController {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_CONTROLEUR_VOL")
    private Long idFlightController;

    @Column(name="VITESSE_ACTUELLE")
    private double vitesseActuelle;

    @Column(name="ALTITUDE_CIBLE")
    private double altitudeCible;

    @OneToMany(mappedBy = "flightController")
    private List<GPSModule> positionCible;

	public FlightController() {
		super();
	}

	public FlightController(Long idFlightController, double vitesseActuelle, double altitudeCible,
			List<GPSModule> positionCible) {
		super();
		this.idFlightController = idFlightController;
		this.vitesseActuelle = vitesseActuelle;
		this.altitudeCible = altitudeCible;
		this.positionCible = positionCible;
	}

	public Long getIdFlightController() {
		return idFlightController;
	}

	public void setIdFlightController(Long idFlightController) {
		this.idFlightController = idFlightController;
	}

	public double getVitesseActuelle() {
		return vitesseActuelle;
	}

	public void setVitesseActuelle(double vitesseActuelle) {
		this.vitesseActuelle = vitesseActuelle;
	}

	public double getAltitudeCible() {
		return altitudeCible;
	}

	public void setAltitudeCible(double altitudeCible) {
		this.altitudeCible = altitudeCible;
	}

	public List<GPSModule> getPositionCible() {
		return positionCible;
	}

	public void setPositionCible(List<GPSModule> positionCible) {
		this.positionCible = positionCible;
	}

}
