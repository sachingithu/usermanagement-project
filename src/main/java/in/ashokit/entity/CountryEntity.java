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
public class CountryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cid;
	private String cname;
	@OneToMany(targetEntity = StateEntity.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "country_id",referencedColumnName = "cid")
	private Set<StateEntity>stateEntity;
	public CountryEntity(Integer cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public CountryEntity() {
		super();
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "CountryEntity [cid=" + cid + ", cname=" + cname + "]";
	}
	
}
