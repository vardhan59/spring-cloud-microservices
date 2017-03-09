package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TollUsage {

	@Id
	private String id;

	private String stationId;

	private String licensePlate;

	private String timeStamp;

	public TollUsage() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param stationId
	 * @param licensePlate
	 * @param timeStamp
	 */
	public TollUsage(String id, String stationId, String licensePlate, String timeStamp) {
		this.id = id;
		this.stationId = stationId;
		this.licensePlate = licensePlate;
		this.timeStamp = timeStamp;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the stationId
	 */
	public String getStationId() {
		return stationId;
	}

	/**
	 * @param stationId
	 *            the stationId to set
	 */
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	/**
	 * @return the licensePlate
	 */
	public String getLicensePlate() {
		return licensePlate;
	}

	/**
	 * @param licensePlate
	 *            the licensePlate to set
	 */
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	/**
	 * @return the timeStamp
	 */
	public String getTimeStamp() {
		return timeStamp;
	}

	/**
	 * @param timeStamp
	 *            the timeStamp to set
	 */
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

}
