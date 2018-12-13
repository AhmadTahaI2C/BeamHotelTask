/**
 * 
 */
package com.beam.hotels.service_locator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beam.hotels.services.available_hotels.AvailableHotelService;
import com.beam.hotels.services.best_hotels.BestHotelsService;
import com.beam.hotels.services.crazy_hotels.CrazyHotelsService;

/**
 * @author aabdelraouf
 *
 */
@Service
public class ServiceLocator {

	@Autowired
	private AvailableHotelService availableHotelService;
	
	@Autowired
	private BestHotelsService bestHotelsService;
	
	@Autowired
	private CrazyHotelsService crazyHotelsService;

	/**
	 * @return the availableHotelService
	 */
	public AvailableHotelService getAvailableHotelService() {
		return availableHotelService;
	}

	/**
	 * @param availableHotelService the availableHotelService to set
	 */
	public void setAvailableHotelService(AvailableHotelService availableHotelService) {
		this.availableHotelService = availableHotelService;
	}

	/**
	 * @return the bestHotelsService
	 */
	public BestHotelsService getBestHotelsService() {
		return bestHotelsService;
	}

	/**
	 * @param bestHotelsService the bestHotelsService to set
	 */
	public void setBestHotelsService(BestHotelsService bestHotelsService) {
		this.bestHotelsService = bestHotelsService;
	}

	/**
	 * @return the crazyHotelsService
	 */
	public CrazyHotelsService getCrazyHotelsService() {
		return crazyHotelsService;
	}

	/**
	 * @param crazyHotelsService the crazyHotelsService to set
	 */
	public void setCrazyHotelsService(CrazyHotelsService crazyHotelsService) {
		this.crazyHotelsService = crazyHotelsService;
	}
	
	
	
}
