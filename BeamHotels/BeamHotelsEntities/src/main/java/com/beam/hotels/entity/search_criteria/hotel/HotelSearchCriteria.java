package com.beam.hotels.entity.search_criteria.hotel;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.beam.hotels.entity.hotel.AvailableTime;

/**
 * @author aabdelraouf
 *
 */
public class HotelSearchCriteria {

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@NotNull(message = "Please provide datefrom param")
	private Date fromDate;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@NotNull(message = "Please provide dateTo param")
	private Date toDate;

	@NotNull(message = "Please provide datefrom param")
	@Max(value = 3, message = "City should be IATA code")
	@Min(value = 3, message = "City should be IATA code")
	private String city;

	@NotNull(message = "Please provide numberOfAdults param")
	private int numberOfAdults;

	private String provider;

	/**
	 * @return fromDate
	 */
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * @param fromDate
	 */
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * @return toDate
	 */
	public Date getToDate() {
		return toDate;
	}

	/**
	 * @param toDate
	 */
	public void setToDate(Date toDate) {
		this.toDate = toDate;
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
	 * @return the numberOfAdults
	 */
	public int getNumberOfAdults() {
		return numberOfAdults;
	}

	/**
	 * @param numberOfAdults the numberOfAdults to set
	 */
	public void setNumberOfAdults(int numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}
	
	public AvailableTime getAvailableTime() {
		return new AvailableTime(fromDate, toDate);
	}

}
