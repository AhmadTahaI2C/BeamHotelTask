/**
 * 
 */
package com.beam.hotels.dao.crazy_hotel;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.beam.hotels.dao.json.hotel.HotelJsonDAOImpl;
import com.beam.hotels.entity.hotel.Hotel;
import com.beam.hotels.entity.search_criteria.hotel.HotelSearchCriteria;

/**
 * DAO provider crazy {@link Hotel} Implementation
 * 
 * @author aabdelraouf
 *
 */
@Component
public class CrazyHotelsDAOImpl extends HotelJsonDAOImpl implements CrazyHotelsDAO {

	@Override
	public List<Hotel> findHotelsBySearchCriteria(HotelSearchCriteria criteria) {

		List<Hotel> hotelByProvider = findAllHotelByProvider(criteria.getProvider());

		List<Hotel> hotelBySearchCriteria = hotelByProvider.stream().filter(h -> checkHotelValidWithSearch(criteria, h))
				.collect(Collectors.toList());

		hotelBySearchCriteria.sort((h1,h2)-> h1.getRate().getNumberRate().compareTo(h2.getRate().getNumberRate()));
		
		return hotelBySearchCriteria;
	}

}
