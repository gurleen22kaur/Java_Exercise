package repositories;

import entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;


public interface PersonRepository extends CrudRepository<Person,Integer> {



    void deleteById(Integer id);
    //using operations
    List<Person> findAllByFirstName(String name);
    List<Person> findAllByLastName(String name);
    Person findById(Integer id);

    //Query Methods
    @Query("SELECT firstName from Person where age=:age")
    String findByAge(@Param("age") Integer age);

    @Query("SELECT firstName,lastName from Person where age=:age")
    List<Person[]> findByAge1(@Param("age") Integer age);


    @Query("SELECT p from Person p where age=:age")
    Person findByAgeEquals(@Param("age") Integer age);

    @Query("select count(*) from Person  where firstName=:firstname")
    Integer countByFirstName(@Param("firstname") String firstname);

    //methods for repo
    Integer countByAge(Integer age);
    List<Person> findDistinctByFirstName(String name);
    List<Person> findByIdOrAge(Integer id,Integer age);
    List<Person> findByIdAndAge(Integer id,Integer age);
    List<Person> findByAgeLessThan(Integer age);
    List<Person> findByAgeGreaterThan(Integer age);
    List<Person> findByFirstNameLike(String s);
    List<Person> findByIdBetween(Integer min,Integer max);
    List<Person> findByFirstNameNot(String s);
    List<Person> findByAgeIn(List<Integer> age);
    List<Person> findByLastNameIgnoreCase(String s);



    //method query for sorting
    List<Person> findByFirstNameOrderByAgeAsc(String name);



    //sorting using class
    List<Person> findAll(Sort sort);



    //Pagination
    Page<Person> findAll(Pageable pageable);


}


