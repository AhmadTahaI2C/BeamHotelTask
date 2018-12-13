/**
 * 
 */
package com.beam.hotels.services.best_hotels;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beam.hotels.dao.best_hotels.BestHotelsDAO;
import com.beam.hotels.entity.hotel.Hotel;
import com.beam.hotels.entity.hotel.response.BestHotelResponse;
import com.beam.hotels.entity.search_criteria.hotel.HotelSearchCriteria;

/**
 * @author aabdelraouf
 *
 */
@Service
public class BestHotelsServiceImpl implements BestHotelsService {

	@Autowired
	private BestHotelsDAO bestHotelsDAO;

	@Override
	public List<BestHotelResponse> responseBySearchCriteria(HotelSearchCriteria searchCriteria) {
		searchCriteria.setProvider("BestHotel");
		List<Hotel> bestHotel = getBestHotelsDAO().findHotelsBySearchCriteria(searchCriteria);

		List<BestHotelResponse> bestHotelResponse = new ArrayList<>();

		bestHotel.forEach(h -> {
			BestHotelResponse response=new BestHotelResponse();
			response.setHotel(h.getHotelName());
			response.setHotelFare(h.getFarePerNight());
			response.setHotelRate(h.getRate().getNumberRate());
			response.setRoomAmenities(getAmenitiesAsString(h.getAmenities().getGenerallyAmenities()));
			bestHotelResponse.add(response);
		});

		return bestHotelResponse;
	}

	/**
	 * @param amenities
	 * @return Amenities as {@link String}
	 */
	private String getAmenitiesAsString(List<String> amenities) {
		 String strAmenities = String.join(",", amenities);
		return strAmenities;
	}

	public BestHotelsDAO getBestHotelsDAO() {
		return bestHotelsDAO;
	}

	public void setBestHotelsDAO(BestHotelsDAO bestHotelsDAO) {
		this.bestHotelsDAO = bestHotelsDAO;
	}

}
