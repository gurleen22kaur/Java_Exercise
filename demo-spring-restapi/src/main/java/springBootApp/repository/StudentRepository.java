package springBootApp.repository;

import org.springframework.data.repository.CrudRepository;
import springBootApp.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}
