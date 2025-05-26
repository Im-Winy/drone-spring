package com.spacex.drone.controller;

import com.spacex.drone.entity.Drone;
import com.spacex.drone.service.DroneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drones")
public class DroneController {

	@Autowired
	private DroneService droneService;

	// Enregistrer un drone
	@PostMapping
	public ResponseEntity<Drone> createDrone(@RequestBody Drone drone) {
		Drone savedDrone = droneService.saveDrone(drone);
		return ResponseEntity.ok(savedDrone);
	}

	// Récupérer un drone par ID
	@GetMapping("/{id}")
	public ResponseEntity<Drone> getDroneById(@PathVariable Long id) {
		Drone drone = droneService.getDroneById(id);
		return ResponseEntity.ok(drone);
	}

	// Récupérer tous les drones
	@GetMapping
	public ResponseEntity<List<Drone>> getAllDrones() {
		List<Drone> drones = droneService.getDrones();
		return ResponseEntity.ok(drones);
	}

	// Supprimer un drone par ID
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteDrone(@PathVariable Long id) {
		Drone drone = droneService.getDroneById(id);
		droneService.deleteDrone(drone);
		return ResponseEntity.noContent().build();
	}

	// Mettre à jour un drone
	@PutMapping("/update/{id}")
	public ResponseEntity<Drone> updateDrone(@PathVariable Long id, @RequestBody Drone droneDetails) {
		Drone existingDrone = droneService.getDroneById(id);

		// Met à jour les champs nécessaires
		existingDrone.setModele(droneDetails.getModele());
		existingDrone.setPoids(droneDetails.getPoids());
		existingDrone.setPorteeMaximale(droneDetails.getPorteeMaximale());
		existingDrone.setCapaciteBatterie(droneDetails.getCapaciteBatterie());
		existingDrone.setCamera(droneDetails.getCamera());
		existingDrone.setGpsModule(droneDetails.getGpsModule());
		existingDrone.setFlightController(droneDetails.getFlightController());

		Drone updatedDrone = droneService.updateDrone(existingDrone);
		return ResponseEntity.ok(updatedDrone);
	}
}
