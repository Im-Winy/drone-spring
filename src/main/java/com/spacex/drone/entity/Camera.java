package com.spacex.drone.entity;

import jakarta.persistence.*;

@Entity
@Table(name="CAMERA")
public class Camera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CAMERA")
    private Long idCamera;

    @Column(name = "RESOLUTION")
    private String resolution;

    @Column(name = "ZOOM")
    private int zoom;

	public Camera() {
		super();
	}

	public Camera(Long idCamera, String resolution, int zoom) {
		super();
		this.idCamera = idCamera;
		this.resolution = resolution;
		this.zoom = zoom;
	}

	public Long getIdCamera() {
		return idCamera;
	}

	public void setIdCamera(Long idCamera) {
		this.idCamera = idCamera;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public int getZoom() {
		return zoom;
	}

	public void setZoom(int zoom) {
		this.zoom = zoom;
	}
    
}
