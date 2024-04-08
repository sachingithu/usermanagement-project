package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.CountryEntity;

public interface ICountryRepo extends JpaRepository<CountryEntity, Integer> {

}
