package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.StateEntity;

public interface IStateRepo extends JpaRepository<StateEntity, Integer> {

}
