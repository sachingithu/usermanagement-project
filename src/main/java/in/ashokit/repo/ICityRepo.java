package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.CityEntity;

public interface ICityRepo extends JpaRepository<CityEntity, Integer> {

}
