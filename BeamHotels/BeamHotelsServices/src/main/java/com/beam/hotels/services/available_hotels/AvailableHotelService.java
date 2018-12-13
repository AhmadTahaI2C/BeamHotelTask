/**
 * 
 */
package com.beam.hotels.services.available_hotels;

import java.util.List;

import com.beam.hotels.entity.hotel.response.AvailableHotelResponse;
import com.beam.hotels.entity.search_criteria.hotel.HotelSearchCriteria;
import com.beam.hotels.services.hotel.HotelService;

/**
 * @author aabdelraouf
 *
 */

public interface AvailableHotelService extends HotelService{

	/**
	 * Return response depend on search criteria 
	 * 
	 * @param searchCriteria
	 * @return {@link List}< {@link AvailableHotelResponse} >  
	 */
	public List<AvailableHotelResponse> responseBySearchCriteria(HotelSearchCriteria searchCriteria);
	
}
