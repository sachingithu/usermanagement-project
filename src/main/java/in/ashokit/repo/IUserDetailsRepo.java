package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.UserDetailsEntity;

public interface IUserDetailsRepo extends JpaRepository<UserDetailsEntity, Integer> {

}
