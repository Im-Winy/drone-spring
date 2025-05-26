package com.spacex.drone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spacex.drone.entity.Drone;

@Repository
public interface IDroneRepository extends JpaRepository<Drone, Long> {

}
