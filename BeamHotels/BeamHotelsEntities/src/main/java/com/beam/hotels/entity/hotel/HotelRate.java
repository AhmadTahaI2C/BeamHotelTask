/**
 * 
 */
package com.beam.hotels.entity.hotel;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Rate hotel number or star
 * <li><b> Number </b></li> number min (1) max (5)
 * <li><b> Star </b></li> Star min (*) max (*****)
 * 
 * @author aabdelraouf
 *
 */
public class HotelRate {

	@JsonProperty
	private String starRate;
	@JsonProperty
	private Integer numberRate;

	/**
	 * Convert number of rate to star
	 * 
	 * @return {@link String} of rate as Star Eg:(****)
	 */
	public String getStarRate() {
		starRate = "";
		for (int i = 0; i < this.numberRate; i++) {
			starRate += "*";
		}
		return starRate;
	}

	/**
	 * 
	 * @param starRate
	 */
	public void setStarRate(String starRate) {
		this.starRate = starRate;
	}

	/**
	 * @return {@link Integer} of rate
	 */
	public Integer getNumberRate() {
		return numberRate;
	}

	/**
	 * @param numberRate
	 */
	public void setNumberRate(Integer numberRate) {
		this.numberRate = numberRate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberRate;
		result = prime * result + ((starRate == null) ? 0 : starRate.hashCode());
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
		HotelRate other = (HotelRate) obj;
		if (numberRate != other.numberRate)
			return false;
		if (starRate == null) {
			if (other.starRate != null)
				return false;
		} else if (!starRate.equals(other.starRate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HotelRate [starRate=" + starRate + ", numberRate=" + numberRate + "]";
	}

}
