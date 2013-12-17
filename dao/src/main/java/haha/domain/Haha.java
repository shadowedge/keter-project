package haha.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Haha{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty
	private String name;

	private Date periodStart;
	private Date periodEnd;
	
	private long userId;//对应userId
	
	/**
	 * @return the periodStart
	 */
	public Date getPeriodStart() {
		return periodStart;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String hahaName) {
		this.name = hahaName;
	}
	/**
	 * @param periodStart the periodStart to set
	 */
	public void setPeriodStart(Date periodStart) {
		this.periodStart = periodStart;
	}
	/**
	 * @return the periodEnd
	 */
	public Date getPeriodEnd() {
		return periodEnd;
	}
	/**
	 * @param periodEnd the periodEnd to set
	 */
	public void setPeriodEnd(Date periodEnd) {
		this.periodEnd = periodEnd;
	}
	
	/**
	 * @return the heheId
	 */
	public long getUserId() {
		return userId;
	}
	/**
	 * @param userId the heheId to set
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}
}
