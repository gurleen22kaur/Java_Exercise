package repositories;

import entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.Repository;

public interface PersonJPARepository extends Repository<Person,Integer>, JpaSpecificationExecutor<Person> {

}
