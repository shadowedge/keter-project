package haha.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Hardwareusage generated by hbm2java
 */
@Entity
public class HahaUserDto implements java.io.Serializable {

	/**long serialVersionUID: TODO属性声明*/
	private static final long serialVersionUID = 1L;

	private String name;
	
	private String userName;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public HahaUserDto() {
	}

	public HahaUserDto(Long id, String name, String userName) {
		this.id = id;
		this.name = name;
		this.userName = userName;
	}

}
