/**
 * 
 */
package com.beam.hotels.entity.hotel;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author aabdelraouf
 *
 */
public class Hotel {

	@JsonProperty
	private String hotelName;

	@JsonProperty
	private String city;

	
	private AvailableTime availableTime;

	private HotelRate rate;

	private HotelAmenities amenities;

	@JsonProperty
	private Double farePerNight;

	@JsonProperty
	private String provider;

	@JsonProperty
	private int numberOfAdults;
	@JsonProperty
	private String discount;
	
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
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the availableTime
	 */
	public AvailableTime getAvailableTime() {
		return availableTime;
	}

	/**
	 * @param availableTime the availableTime to set
	 */
	public void setAvailableTime(AvailableTime availableTime) {
		this.availableTime = availableTime;
	}

	/**
	 * @return the rate
	 */
	public HotelRate getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(HotelRate rate) {
		this.rate = rate;
	}

	/**
	 * @return the amenities
	 */
	public HotelAmenities getAmenities() {
		return amenities;
	}

	/**
	 * @param amenities the amenities to set
	 */
	public void setAmenities(HotelAmenities amenities) {
		this.amenities = amenities;
	}

	/**
	 * @return the farePerNight
	 */
	public Double getFarePerNight() {
		return farePerNight;
	}

	/**
	 * @param farePerNight the farePerNight to set
	 */
	public void setFarePerNight(Double farePerNight) {
		this.farePerNight = farePerNight;
	}

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
	 * @return
	 */
	public int getNumberOfAdults() {
		return numberOfAdults;
	}

	/**
	 * @param numberOfAdults
	 */
	public void setNumberOfAdults(int numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amenities == null) ? 0 : amenities.hashCode());
		result = prime * result + ((availableTime == null) ? 0 : availableTime.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		long temp;
		temp = Double.doubleToLongBits(farePerNight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((hotelName == null) ? 0 : hotelName.hashCode());
		result = prime * result + ((provider == null) ? 0 : provider.hashCode());
		result = prime * result + ((rate == null) ? 0 : rate.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		if (amenities == null) {
			if (other.amenities != null)
				return false;
		} else if (!amenities.equals(other.amenities))
			return false;
		if (availableTime == null) {
			if (other.availableTime != null)
				return false;
		} else if (!availableTime.equals(other.availableTime))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (Double.doubleToLongBits(farePerNight) != Double.doubleToLongBits(other.farePerNight))
			return false;
		if (hotelName == null) {
			if (other.hotelName != null)
				return false;
		} else if (!hotelName.equals(other.hotelName))
			return false;
		if (provider == null) {
			if (other.provider != null)
				return false;
		} else if (!provider.equals(other.provider))
			return false;
		if (rate == null) {
			if (other.rate != null)
				return false;
		} else if (!rate.equals(other.rate))
			return false;
		return true;
	}

 
	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", city=" + city + ", availableTime=" + availableTime + ", rate="
				+ rate + ", amenities=" + amenities + ", farePerNight=" + farePerNight + ", provider=" + provider + "]";
	}

}
