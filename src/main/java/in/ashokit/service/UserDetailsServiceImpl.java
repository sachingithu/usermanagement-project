package in.ashokit.service;

import java.security.SecureRandom;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.CountryEntity;
import in.ashokit.entity.StateEntity;
import in.ashokit.entity.UserDetailsEntity;
import in.ashokit.repo.ICityRepo;
import in.ashokit.repo.ICountryRepo;
import in.ashokit.repo.IStateRepo;
import in.ashokit.repo.IUserDetailsRepo;

@Service
public class UserDetailsServiceImpl implements IUserDetailsService{
	@Autowired
	private IUserDetailsRepo userRepo;
	@Autowired
	private ICountryRepo countryRepo;
	@Autowired
	private IStateRepo stateRepo;
	@Autowired
	private ICityRepo cityRepo;
 //   private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	@Override
	public boolean saveUserData(UserDetailsEntity userDetails) {
		
		return false;
	}
	@Override
	public List<CountryEntity> getCountries() {
		
		return countryRepo.findAll();
	}
	@Override
	public StateEntity findByStatEntity(int cid) {
		StateEntity entity=countryRepo.findByStateEnity(cid);
		
		return entity;
	}

/*	public String generatePassword() {
		int length=10;
		StringBuilder sb=new StringBuilder(length);
		for(int i=0;i<length;i++) {
			SecureRandom random=new SecureRandom();
			Integer pwd=random.nextInt(ALPHABET.length());
			sb.append(ALPHABET.charAt(pwd));
			
		}
		return sb.toString();
	}
	*/
}
