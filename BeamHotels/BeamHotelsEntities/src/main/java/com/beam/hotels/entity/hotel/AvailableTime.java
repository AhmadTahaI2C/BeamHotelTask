/**
 * 
 */
package com.beam.hotels.entity.hotel;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author aabdelraouf
 *
 */
public class AvailableTime {

	@JsonIgnore
	private List<Date> timesAvailable;

	private Date from;

	private Date to;

	public AvailableTime() {
	}

	public AvailableTime(Date from, Date to) {
		this.from = from;
		this.to = to;
	}

	public List<Date> getTimesAvailable() {
		return timesAvailable;
	}

	public void setTimesAvailable(List<Date> timesAvailable) {
		this.timesAvailable = timesAvailable;
	}

	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	public Date getTo() {
		return to;
	}

	public void setTo(Date to) {
		this.to = to;
	}

	public boolean between(AvailableTime searchAvailableTime) {
		int compareFromDate = searchAvailableTime.getFrom().compareTo(this.getFrom());
		int compareToDate = searchAvailableTime.getTo().compareTo(this.getTo());
		if ((compareFromDate >= 0) && (compareToDate <= 0)) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + ((timesAvailable == null) ? 0 : timesAvailable.hashCode());
		result = prime * result + ((to == null) ? 0 : to.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AvailableTime other = (AvailableTime) obj;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (timesAvailable == null) {
			if (other.timesAvailable != null)
				return false;
		} else if (!timesAvailable.equals(other.timesAvailable))
			return false;
		if (to == null) {
			if (other.to != null)
				return false;
		} else if (!to.equals(other.to))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AvailableTime [timesAvailable=" + timesAvailable + ", from=" + from + ", to=" + to + "]";
	}

}
