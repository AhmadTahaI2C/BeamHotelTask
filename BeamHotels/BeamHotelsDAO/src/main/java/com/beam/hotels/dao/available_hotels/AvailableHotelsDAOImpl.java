/**
 * 
 */
package com.beam.hotels.dao.available_hotels;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.beam.hotels.dao.json.hotel.HotelJsonDAOImpl;
import com.beam.hotels.entity.hotel.Hotel;
import com.beam.hotels.entity.search_criteria.hotel.HotelSearchCriteria;

/**
 * DAO available {@link Hotel} Implementation
 * @author aabdelraouf
 *
 */
@Component
public class AvailableHotelsDAOImpl extends HotelJsonDAOImpl implements AvailableHotelsDAO {

	/* 
	 * Use stream for list collection to filter data
	 * 
	 *   
	 * @see com.beam.hotels.dao.json.hotel.HotelJsonDAOImpl#findHotelsBySearchCriteria(com.beam.hotels.entity.search_criteria.hotel.HotelSearchCriteria)
	 */
	@Override
	public List<Hotel> findHotelsBySearchCriteria(HotelSearchCriteria criteria) {
		List<Hotel> allHotel = findAllHotel();
		List<Hotel> hotelBySearchCriteria = allHotel.stream().filter(h -> checkHotelValidWithSearch(criteria, h))
				.collect(Collectors.toList());
		
		hotelBySearchCriteria.sort((h1,h2)-> h1.getRate().getNumberRate().compareTo(h2.getRate().getNumberRate()));
		
		return hotelBySearchCriteria;
	}

}
