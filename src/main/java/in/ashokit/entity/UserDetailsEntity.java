package in.ashokit.entity;

import java.time.LocalDate;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class UserDetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uid;
	private String uname;
	private String email;
	private Long phoneNo;
	private String pwd;
	private String updatedPwd;
	@CreationTimestamp
	private LocalDate createdDate;
	@UpdateTimestamp
	private LocalDate updatedDate;
	
	@OneToOne(targetEntity = CountryEntity.class,
							 cascade = CascadeType.ALL,
							 fetch = FetchType.LAZY)
	@JoinColumn(name = "country_id",referencedColumnName = "cid")
	private CountryEntity countryEntity;

	public UserDetailsEntity(Integer uid, String uname, String email, Long phoneNo, String pwd, String updatedPwd,
			LocalDate createdDate, LocalDate updatedDate) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.email = email;
		this.phoneNo = phoneNo;
		this.pwd = pwd;
		this.updatedPwd = updatedPwd;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUpdatedPwd() {
		return updatedPwd;
	}
	public void setUpdatedPwd(String updatedPwd) {
		this.updatedPwd = updatedPwd;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDate getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

}
