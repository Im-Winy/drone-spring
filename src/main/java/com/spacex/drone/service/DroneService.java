package com.spacex.drone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spacex.drone.entity.Drone;
import com.spacex.drone.repository.IDroneRepository;

@Service
public class DroneService {

	@Autowired
	IDroneRepository droneRepository;

	// Enregistre un drone
	public Drone saveDrone(Drone drone) {
		return droneRepository.save(drone);
	}

	// Récupère un seul drone par son id
	public Drone getDroneById(Long idDrone) {
		return droneRepository.findById(idDrone).get();
	}

	// Récupère tout les drones
	public List<Drone> getDrones() {
		return droneRepository.findAll();
	}

	// Supprime un drone
	public void deleteDrone(Drone Drone) {
		droneRepository.delete(Drone);
	}

	// Met à jour un drone
	public Drone updateDrone(Drone drone) {
		return droneRepository.save(drone);
	}
}
