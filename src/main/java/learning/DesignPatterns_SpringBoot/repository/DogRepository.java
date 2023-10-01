package learning.DesignPatterns_SpringBoot.repository;

import learning.DesignPatterns_SpringBoot.model.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends CrudRepository<Dog, String>  {
}
