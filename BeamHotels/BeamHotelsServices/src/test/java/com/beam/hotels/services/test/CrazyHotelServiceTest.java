/**
 * 
 */
package com.beam.hotels.services.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.beam.hotels.dao.crazy_hotel.CrazyHotelsDAOImpl;
import com.beam.hotels.entity.hotel.response.CrazyHotelResponse;
import com.beam.hotels.entity.search_criteria.hotel.HotelSearchCriteria;
import com.beam.hotels.services.crazy_hotels.CrazyHotelsService;
import com.beam.hotels.services.crazy_hotels.CrazyHotelsServiceImpl;

/**
 * @author aabdelraouf
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = { CrazyHotelsServiceImpl.class, CrazyHotelsDAOImpl.class })
public class CrazyHotelServiceTest {

	@Autowired
	private CrazyHotelsService crazyHotelsService;

	@Test
	public void testResponseBySearchCriteria() throws Exception {

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date from = getFromDate(df);
		Date to = getToDate(df);

		HotelSearchCriteria searchCriteria = new HotelSearchCriteria();

		searchCriteria.setFromDate(from);
		searchCriteria.setToDate(to);
		searchCriteria.setCity("AMM");
		searchCriteria.setNumberOfAdults(20);
		searchCriteria.setProvider("CrazyHotel");

		List<CrazyHotelResponse> responseBySearchCriteria = getCrazyHotelsService()
				.responseBySearchCriteria(searchCriteria);

		assertThat(responseBySearchCriteria.size(), is(5));

	}

	private Date getToDate(SimpleDateFormat df) {
		String strTo = "2018-12-30";
		Calendar calTo = Calendar.getInstance();

		try {
//			calFrom.setTime(df.parse(strFrom));
			calTo.setTime(df.parse(strTo));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Date to = calTo.getTime();
		return to;
	}

	private Date getFromDate(SimpleDateFormat df) {
		String strFrom = "2018-12-17";
		Calendar calFrom = Calendar.getInstance();

		try {
			calFrom.setTime(df.parse(strFrom));
//			calTo.setTime(df.parse(strTo));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Date from = calFrom.getTime();
		return from;
	}

	public CrazyHotelsService getCrazyHotelsService() {
		return crazyHotelsService;
	}

	public void setCrazyHotelsService(CrazyHotelsService crazyHotelsService) {
		this.crazyHotelsService = crazyHotelsService;
	}

}
