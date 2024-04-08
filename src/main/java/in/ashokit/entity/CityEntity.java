package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CityEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cityid;
	private String cityName;
	public CityEntity(Integer cityid, String cityName) {
		super();
		this.cityid = cityid;
		this.cityName = cityName;
	}
	public Integer getCityid() {
		return cityid;
	}
	public void setCityid(Integer cityid) {
		this.cityid = cityid;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "CityEntity [cityid=" + cityid + ", cityName=" + cityName + "]";
	}
	public CityEntity() {
		super();
	}
	
	
}
