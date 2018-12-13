/**
 * 
 */
package com.beam.hotels.entity.hotel.response;

import java.util.List;

/**
 * @author aabdelraouf
 *
 */
public class AvailableHotelResponse extends HotelResponse {

	// name of the provider ex:(“BestHotels” or “CrazyHotels”)
	private String provider;

	// Name of the hotel
	private String hotelName;

	// fare per night
	private int fare;

	// array of strings
	private List<String> amenities;

	/**
	 * @return the provider
	 */
	public String getProvider() {
		return provider;
	}

	/**
	 * @param provider the provider to set
	 */
	public void setProvider(String provider) {
		this.provider = provider;
	}

	/**
	 * @return the hotelName
	 */
	public String getHotelName() {
		return hotelName;
	}

	/**
	 * @param hotelName the hotelName to set
	 */
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	/**
	 * @return the fare
	 */
	public int getFare() {
		return fare;
	}

	/**
	 * @param fare the fare to set
	 */
	public void setFare(int fare) {
		this.fare = fare;
	}

	/**
	 * @return the amenities
	 */
	public List<String> getAmenities() {
		return amenities;
	}

	/**
	 * @param amenities the amenities to set
	 */
	public void setAmenities(List<String> amenities) {
		this.amenities = amenities;
	}

}
