package in.ashokit.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class StateEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sid;
	private String sname;
	@OneToMany(targetEntity = CityEntity.class,
							  cascade = CascadeType.ALL,
							  fetch = FetchType.LAZY)
	@JoinColumn(name = "state_id",referencedColumnName = "sid")
	private Set<CityEntity> cityEntity;
	public StateEntity(Integer sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
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
	@Override
	public String toString() {
		return "StateEntity [sid=" + sid + ", sname=" + sname + "]";
	}
	
}
