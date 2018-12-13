/**
 * 
 */
package com.beam.hotels.dao.json.hotel;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.beam.hotels.entity.hotel.Hotel;
import com.beam.hotels.entity.search_criteria.hotel.HotelSearchCriteria;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author aabdelraouf
 *
 */
@Component
public class HotelJsonDAOImpl implements HotelJsonDAO {

	private List<Hotel> dataHotels;

	@PostConstruct
	public void init() {
		ObjectMapper mapper = new ObjectMapper();

		try {
			ClassLoader classLoader = getClass().getClassLoader();
			InputStream resourceAsStream = classLoader.getResourceAsStream("hotels.json");
			Hotel[] arrHotel = mapper.readValue(resourceAsStream, Hotel[].class);
			dataHotels = Arrays.asList(arrHotel);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Hotel> findAllHotel() {
		return dataHotels;
	}

	@Override
	public List<Hotel> findAllHotelByProvider(String provider) {
		List<Hotel> hotelsByProvider = this.dataHotels.stream().filter(h -> h.getProvider().equalsIgnoreCase(provider))
				.collect(Collectors.toList());
		return hotelsByProvider;
	}

	@Override
	public boolean checkHotelValidWithSearch(HotelSearchCriteria criteria, Hotel hotel) {
		if ((hotel.getCity().equalsIgnoreCase(criteria.getCity()))
				&& (hotel.getNumberOfAdults() == criteria.getNumberOfAdults())
				&& hotel.getAvailableTime().between(criteria.getAvailableTime())) {
			return true;
		}
		return false;
	}

	@Override
	public List<Hotel> findHotelsBySearchCriteria(HotelSearchCriteria criteria) {
		return null;
	}

	/**
	 * 
	 * @return {@link List} < {@link Hotel} >
	 */
	public List<Hotel> getDataHotels() {
		return dataHotels;
	}

	/**
	 * @param dataHotels
	 */
	public void setDataHotels(List<Hotel> dataHotels) {
		this.dataHotels = dataHotels;
	}

}
