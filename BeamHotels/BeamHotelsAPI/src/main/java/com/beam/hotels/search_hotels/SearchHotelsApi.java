/**
 * 
 */
package com.beam.hotels.search_hotels;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beam.hotels.entity.hotel.Hotel;
import com.beam.hotels.entity.hotel.response.AvailableHotelResponse;
import com.beam.hotels.entity.hotel.response.BestHotelResponse;
import com.beam.hotels.entity.hotel.response.CrazyHotelResponse;
import com.beam.hotels.entity.search_criteria.hotel.HotelSearchCriteria;
import com.beam.hotels.service_locator.ServiceLocator;
import com.beam.hotels.services.best_hotels.BestHotelsService;

/**
 * Search Hotels depend on provider or available hotels
 * 
 * @author aabdelraouf
 *
 */
@RestController
public class SearchHotelsApi {

	@Autowired
	private ServiceLocator serviceLocator;

	/**
	 * Find available {@link Hotel}s API
	 * 
	 *
	 * @param criteria
	 * @return {@link List} <{@link AvailableHotelResponse}>
	 */
	@RequestMapping("/AvailableHotels")
	public List<AvailableHotelResponse> getAvailableHotels(HotelSearchCriteria criteria) {
		return serviceLocator.getAvailableHotelService().responseBySearchCriteria(criteria);
	}

	/**
	 * Find Best {@link Hotel}s API
	 * <li>{@link BestHotelsService}</li>
	 * 
	 * @param criteria
	 * @return {@link List} <{@link BestHotelResponse}>
	 */
	@RequestMapping("/BestHotels")
	public List<BestHotelResponse> getBestHotels(HotelSearchCriteria criteria) {
		return serviceLocator.getBestHotelsService().responseBySearchCriteria(criteria);
	}

	/**
	 * Find Crazy {@link Hotel}s API
	 * 
	 * @param criteria
	 * @return {@link List} <{@link CrazyHotelResponse}>
	 */
	@RequestMapping("/CrazyHotels")
	public List<CrazyHotelResponse> getCrazyHotels(HotelSearchCriteria criteria) {
		return serviceLocator.getCrazyHotelsService().responseBySearchCriteria(criteria);
	}

	public ServiceLocator getServiceLocator() {
		return serviceLocator;
	}

	public void setServiceLocator(ServiceLocator serviceLocator) {
		this.serviceLocator = serviceLocator;
	}

}
