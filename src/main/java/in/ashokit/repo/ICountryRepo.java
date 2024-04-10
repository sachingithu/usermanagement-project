package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entity.CountryEntity;
import in.ashokit.entity.StateEntity;

public interface ICountryRepo extends JpaRepository<CountryEntity, Integer> {
	@Query(value="SELECT sname FROM stateentity WHERE state_id=:cid",nativeQuery = true)
	public StateEntity findByStateEnity(Integer cid);
}
