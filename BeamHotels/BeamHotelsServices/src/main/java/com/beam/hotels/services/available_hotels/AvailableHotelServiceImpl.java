/**
 * 
 */
package com.beam.hotels.services.available_hotels;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beam.hotels.dao.available_hotels.AvailableHotelsDAO;
import com.beam.hotels.entity.hotel.Hotel;
import com.beam.hotels.entity.hotel.response.AvailableHotelResponse;
import com.beam.hotels.entity.search_criteria.hotel.HotelSearchCriteria;

/**
 * @author aabdelraouf
 *
 */
@Service
public class AvailableHotelServiceImpl implements AvailableHotelService {

	@Autowired
	private AvailableHotelsDAO availableHotelsDAO;

	@Override
	public List<AvailableHotelResponse> responseBySearchCriteria(HotelSearchCriteria searchCriteria) {
		List<Hotel> hotelsBySearchCriteria = availableHotelsDAO.findHotelsBySearchCriteria(searchCriteria);
		List<AvailableHotelResponse> availableHotelResponse = new ArrayList<>();

		hotelsBySearchCriteria.forEach(h -> {
			AvailableHotelResponse response = new AvailableHotelResponse();
			response.setFare(h.getFarePerNight().intValue());
			response.setAmenities(h.getAmenities().getGenerallyAmenities());
			response.setHotelName(h.getHotelName());
			response.setProvider(h.getHotelName());
			availableHotelResponse.add(response);
		});

		
		
		
		return availableHotelResponse;
	}

	public AvailableHotelsDAO getAvailableHotelsDAO() {
		return availableHotelsDAO;
	}

	public void setAvailableHotelsDAO(AvailableHotelsDAO availableHotelsDAO) {
		this.availableHotelsDAO = availableHotelsDAO;
	}

}
