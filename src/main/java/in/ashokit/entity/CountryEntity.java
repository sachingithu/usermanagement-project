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
import jakarta.persistence.Table;

@Entity
@Table(name = "Country_Master")
public class CountryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cid;
	private String cname;
/*	@OneToMany(targetEntity = StateEntity.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "country_id",referencedColumnName = "cid")
	private Set<StateEntity>stateEntity;
*/
	public CountryEntity(Integer cid, String cname, Set<StateEntity> stateEntity) {
		super();
		this.cid = cid;
		this.cname = cname;
//		this.stateEntity = stateEntity;
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
/*	public Set<StateEntity> getStateEntity() {
		return stateEntity;
	}
	public void setStateEntity(Set<StateEntity> stateEntity) {
		this.stateEntity = stateEntity;
	}
	*/
	
	@Override
	public String toString() {
		return "CountryEntity [cid=" + cid + ", cname=" + cname + ", stateEntity=" + "]";
	}

	
}
