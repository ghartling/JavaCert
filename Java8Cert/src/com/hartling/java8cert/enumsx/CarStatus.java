package com.hartling.java8cert.enumsx;

public enum CarStatus {
	READY("Ready to drive"), OFF("Engine Off"), ON("Engine On");

	private String description;

	CarStatus(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
