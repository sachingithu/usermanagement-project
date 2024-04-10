package in.ashokit.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Sate_Master")
public class StateEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sid;
	private String sname;
	
	@ManyToOne(targetEntity = CountryEntity.class)
	@JoinColumn(name = "country_id",referencedColumnName = "cid")
	private CountryEntity countryEntity;
	@OneToMany(targetEntity = CityEntity.class,
							  cascade = CascadeType.ALL,
							  fetch = FetchType.LAZY)
	@JoinColumn(name = "state_id",referencedColumnName = "sid")
	private Set<CityEntity> cityEntity;

	public StateEntity() {
		super();
	}
	public StateEntity(Integer sid, String sname, Set<CityEntity> cityEntity) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.cityEntity = cityEntity;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public Set<CityEntity> getCityEntity() {
		return cityEntity;
	}
	public void setCityEntity(Set<CityEntity> cityEntity) {
		this.cityEntity = cityEntity;
	}
	
	public CountryEntity getCountryEntity() {
		return countryEntity;
	}
	public void setCountryEntity(CountryEntity countryEntity) {
		this.countryEntity = countryEntity;
	}
	@Override
	public String toString() {
		return "StateEntity [sid=" + sid + ", sname=" + sname + ", cityEntity=" + cityEntity + "]";
	}

}
