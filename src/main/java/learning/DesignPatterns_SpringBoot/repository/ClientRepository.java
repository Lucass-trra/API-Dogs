package learning.DesignPatterns_SpringBoot.repository;

import learning.DesignPatterns_SpringBoot.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
}
