/**
 * 
 */
package com.beam.hotels.entity.hotel.response;

import java.util.List;

import com.beam.hotels.entity.hotel.HotelAmenities;

/**
 * @author aabdelraouf
 *
 */
public class CrazyHotelResponse extends HotelResponse {

    // Name of the hotel
	private String hotelName;

	// String of '*' from 1-5, Eg: *, *****
	private String rate;

    // Price of the hotel per night
	private int price;

	//discount on the room (if available).
	private String discount;

    // array of strings.
	private List<HotelAmenities> amenities;

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
	 * Rate as (**)
	 * 
	 * @return the rate
	 */
	public String getRate() {
		return rate;
	}

	/**
	 *
	 * 
	 *
	 * @param rate the rate to set
	 */
	public void setRate(String rate) {
		this.rate = rate;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the discount
	 */
	public String getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(String discount) {
		this.discount = discount;
	}

	/**
	 * @return the amenities
	 */
	public List<HotelAmenities> getAmenities() {
		return amenities;
	}

	/**
	 * @param amenities the amenities to set
	 */
	public void setAmenities(List<HotelAmenities> amenities) {
		this.amenities = amenities;
	}

}
