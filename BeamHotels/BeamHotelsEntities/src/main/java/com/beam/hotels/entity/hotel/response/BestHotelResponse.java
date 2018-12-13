/**
 * 
 */
package com.beam.hotels.entity.hotel.response;

/**
 * @author aabdelraouf
 *
 */
public class BestHotelResponse extends HotelResponse {

	// Name of the hotel
	private String hotel;
	// Number from 1-5
	private int hotelRate;
	// Total price rounded to 2 decimals
	private double hotelFare;
    // String of amenities separated by comma
	private String roomAmenities;

	/**
	 * @return the hotel
	 */
	public String getHotel() {
		return hotel;
	}

	/**
	 * @param hotel the hotel to set
	 */
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	/**
	 * @return the hotelRate
	 */
	public int getHotelRate() {
		return hotelRate;
	}

	/**
	 * @param hotelRate the hotelRate to set
	 */
	public void setHotelRate(int hotelRate) {
		this.hotelRate = hotelRate;
	}

	/**
	 * @return the hotelFare
	 */
	public double getHotelFare() {
		return hotelFare;
	}

	/**
	 * @param hotelFare the hotelFare to set
	 */
	public void setHotelFare(double hotelFare) {
		this.hotelFare = hotelFare;
	}

	/**
	 * @return the roomAmenities
	 */
	public String getRoomAmenities() {
		return roomAmenities;
	}

	/**
	 * @param roomAmenities the roomAmenities to set
	 */
	public void setRoomAmenities(String roomAmenities) {
		this.roomAmenities = roomAmenities;
	}

}
