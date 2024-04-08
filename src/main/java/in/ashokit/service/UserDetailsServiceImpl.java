package in.ashokit.service;

import java.security.SecureRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.UserDetailsEntity;
import in.ashokit.repo.IUserDetailsRepo;

@Service
public class UserDetailsServiceImpl implements IUserDetailsService{
	@Autowired
	private IUserDetailsRepo userRepo;
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	@Override
	public boolean saveUserData(UserDetailsEntity userDetails) {
		
		return false;
	}

	public String generatePassword() {
		int length=10;
		StringBuilder sb=new StringBuilder(length);
		for(int i=0;i<length;i++) {
			SecureRandom random=new SecureRandom();
			Integer pwd=random.nextInt(ALPHABET.length());
			sb.append(ALPHABET.charAt(pwd));
			
		}
		return sb.toString();
	}
}
