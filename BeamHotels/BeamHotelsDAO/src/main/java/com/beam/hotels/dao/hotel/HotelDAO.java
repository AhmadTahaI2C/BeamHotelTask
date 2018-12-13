/**
 * 
 */
package com.beam.hotels.dao.hotel;

import java.util.List;

import com.beam.hotels.entity.hotel.Hotel;
import com.beam.hotels.entity.hotel.HotelRate;
import com.beam.hotels.entity.search_criteria.hotel.HotelSearchCriteria;

/**
 * Base {@link Hotel} DAO
 * 
 * @author aabdelraouf
 *
 */
public interface HotelDAO {

	/**
	 * Find all {@link Hotel} order by {@link HotelRate}. 
	 * 
	 * @return {@link List} <{@link Hotel}>
	 */
	public List<Hotel> findAllHotel();

	/**
	 * Find {@link Hotel} by Provider.
	 * 
	 * @param provider
	 * @return {@link List} <{@link Hotel}>
	 */
	public List<Hotel> findAllHotelByProvider(String provider);

	/**
	 * Find {@link Hotel}s matched with {@link HotelSearchCriteria} order by {@link HotelRate}
	 * 
	 * @param criteria
	 * @return {@link List} <{@link Hotel}>
	 */
	public List<Hotel> findHotelsBySearchCriteria(HotelSearchCriteria criteria);

	/**
	 * Check {@link Hotel} matched with {@link HotelSearchCriteria}  order by {@link HotelRate}
	 * 
	 * @param criteria
	 * @param hotel
	 * @return valid hotel {@link HotelSearchCriteria}
	 */
	public boolean checkHotelValidWithSearch(HotelSearchCriteria criteria, Hotel hotel);

}
