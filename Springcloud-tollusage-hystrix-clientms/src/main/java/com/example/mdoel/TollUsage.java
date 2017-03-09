package com.example.mdoel;

public class TollUsage {

	private String id;

	private String stationId;

	private String licencePlate;

	private String timeStamp;

	public TollUsage() {
		// TODO Auto-generated constructor stub
	}
	
	public TollUsage(String string, String string2, String string3, String string4) {
		this.id=string;
		this.stationId=string2;
		this.licencePlate=string3;
		this.timeStamp=string4;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStationId() {
		return stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public String getLicencePlate() {
		return licencePlate;
	}

	public void setLicencePlate(String licencePlate) {
		this.licencePlate = licencePlate;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

}
