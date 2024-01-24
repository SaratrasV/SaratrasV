package org.practica.alfredo.Streaming.model;

import java.time.LocalTime;

public class Historial {
	private String userId;
	private String audiovisualId;
	private LocalTime tiempoVisto;
	
	public Historial() {
		
	}
	public Historial(String userId, String audioVisualId, LocalTime tiempoVisto) {
		super();
		this.userId = userId;
		this.setAudiovisualId(audioVisualId);
		this.tiempoVisto = tiempoVisto;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public LocalTime getTiempoVisto() {
		return tiempoVisto;
	}
	public void setTiempoVisto(LocalTime tiempoVisto) {
		this.tiempoVisto = tiempoVisto;
	}
	public String getAudiovisualId() {
		return audiovisualId;
	}
	public void setAudiovisualId(String audiovisualId) {
		this.audiovisualId = audiovisualId;
	}
	
	

}
