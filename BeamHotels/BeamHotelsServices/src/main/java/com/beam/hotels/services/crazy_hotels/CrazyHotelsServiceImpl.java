/**
 * 
 */
package com.beam.hotels.services.crazy_hotels;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beam.hotels.dao.crazy_hotel.CrazyHotelsDAO;
import com.beam.hotels.entity.hotel.Hotel;
import com.beam.hotels.entity.hotel.response.CrazyHotelResponse;
import com.beam.hotels.entity.search_criteria.hotel.HotelSearchCriteria;

/**
 * @author aabdelraouf
 *
 */
@Service
public class CrazyHotelsServiceImpl implements CrazyHotelsService {

	@Autowired
	private CrazyHotelsDAO crazyHotelsDAO;

	@Override
	public List<CrazyHotelResponse> responseBySearchCriteria(HotelSearchCriteria searchCriteria) {
		searchCriteria.setProvider("CrazyHotel");
		List<Hotel> crazyHotel = crazyHotelsDAO.findHotelsBySearchCriteria(searchCriteria);

		List<CrazyHotelResponse> crazyHotelResponse = new ArrayList<>();

		crazyHotel.forEach(h -> {
			CrazyHotelResponse response = new CrazyHotelResponse();
			response.setHotelName(h.getHotelName());
			if (!h.getDiscount().isEmpty()) {
				response.setDiscount(h.getDiscount());
			}
			response.setPrice(h.getFarePerNight().intValue());
			response.setRate(h.getRate().getStarRate());
			crazyHotelResponse.add(response);
		});

		return crazyHotelResponse;
	}

	public CrazyHotelsDAO getCrazyHotelsDAO() {
		return crazyHotelsDAO;
	}

	public void setCrazyHotelsDAO(CrazyHotelsDAO crazyHotelsDAO) {
		this.crazyHotelsDAO = crazyHotelsDAO;
	}

}
