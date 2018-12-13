package com.beam.hotels.entity.hotel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * Amenities For Hotel
 * <li> <b>Room</b> </li>
 * <li> <b>generally</b> </li>
 * 
 * @author aabdelraouf
 *
 */
public class HotelAmenities {

	
	@JsonProperty
	private List<String> roomsAmenities;

	@JsonProperty
	private List<String> generallyAmenities;

	/**
	 * @return
	 */
	public List<String> getRoomsAmenities() {
		return roomsAmenities;
	}

	/**
	 * @param roomsAmenities
	 */
	public void setRoomsAmenities(List<String> roomsAmenities) {
		this.roomsAmenities = roomsAmenities;
	}

	/**
	 * @return
	 */
	public List<String> getGenerallyAmenities() {
		return generallyAmenities;
	}

	/**
	 * @param generallyAmenities
	 */
	public void setGenerallyAmenities(List<String> generallyAmenities) {
		this.generallyAmenities = generallyAmenities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((generallyAmenities == null) ? 0 : generallyAmenities.hashCode());
		result = prime * result + ((roomsAmenities == null) ? 0 : roomsAmenities.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelAmenities other = (HotelAmenities) obj;
		if (generallyAmenities == null) {
			if (other.generallyAmenities != null)
				return false;
		} else if (!generallyAmenities.equals(other.generallyAmenities))
			return false;
		if (roomsAmenities == null) {
			if (other.roomsAmenities != null)
				return false;
		} else if (!roomsAmenities.equals(other.roomsAmenities))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HotelAmenities [roomsAmenities=" + roomsAmenities + ", generallyAmenities=" + generallyAmenities + "]";
	}
	
}
