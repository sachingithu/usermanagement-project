package in.ashokit.service;

import java.util.Map;

import in.ashokit.dto.RegisterDto;
import in.ashokit.dto.ResetPwdDto;
import in.ashokit.entity.UserDetailsEntity;

public interface IUserDetailsService {
	//For saving user details
/*	public boolean saveUserData(UserDetailsEntity userDetails);
	public List<CountryEntity> getCountries();
	public StateEntity findByStatEntity(int cid);
	*/
	//Used to get all countries required
	public Map<Integer,String> getCountries();
	//Used to get all states required
	public Map<Integer,String> getStates();
	//Used to get all cities required
	public Map<Integer,String> getCities();
	/*public UserDto getUSer(String email);*/
	//Used for register user
	public boolean registerUser(RegisterDto regDto);
	//
	/*public UserDto getUser(LoginDto loginDto);*/
	public boolean resetPwd(ResetPwdDto pwdDto);
	
	public String getQuote();//api call
	
	
}
