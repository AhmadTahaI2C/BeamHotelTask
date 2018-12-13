/**
 * 
 */
package com.beam.hotels.services.best_hotels;

import java.util.List;

import com.beam.hotels.entity.hotel.response.BestHotelResponse;
import com.beam.hotels.entity.search_criteria.hotel.HotelSearchCriteria;
import com.beam.hotels.services.hotel.HotelService;

/**
 * @author aabdelraouf
 *
 */
public interface BestHotelsService extends HotelService{

	/**
	 * Return response depend on search criteria 
	 * 
	 * @param searchCriteria
	 * @return {@link List}< {@link BestHotelResponse} >  
	 */
	public List<BestHotelResponse> responseBySearchCriteria(HotelSearchCriteria searchCriteria);
	
	
}
