package Dummy;

import configuration.PersistenceContext;
import entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import repositories.PersonJPARepository;
import repositories.PersonRepository;

import javax.persistence.criteria.*;
import java.util.*;

public class Dummy_Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersistenceContext.class);
        PersonRepository personRepository = applicationContext.getBean(PersonRepository.class);
        //Create
        /*for (int i = 1; i <= 10; i++) {
            Person person = new Person("first" + i, "last" + i, 20 + i, 1000 + (i * 100));
            personRepository.save(person);
            System.out.println(person);
            }*/



        //Update
       /* Person person = personRepository.findById(3);
        person.setFirstName("third name");
        personRepository.save(person);
*/


        //Delete
       /* personRepository.deleteById(16);*/



        //using operations
        /*List<Person> people_first=personRepository.findAllByFirstName("first1");
        System.out.println(people_first);

        List<Person> people_last=personRepository.findAllByLastName("last1");
        System.out.println(people_last);

        Person person=personRepository.findById(3);
        System.out.println(person);*/


        //Query Methods
        /*
        String person1=personRepository.findByAge(25);
        System.out.println(person1);


        //to be discussed
       *//* List<Person[]> personList=personRepository.findByAge1(25);
        System.out.println(personList);*//*

        Person per=personRepository.findByAgeEquals(25);
        System.out.println(per);

        Integer count=personRepository.countByFirstName("peter");
        System.out.println(count);*/

        //more methods for repo
        /*Integer cou=personRepository.countByAge(22);
        System.out.println(cou);

        List<Person> p=personRepository.findDistinctByFirstName("first1");
        System.out.println(p);

        List<Person> pe=personRepository.findByIdOrAge(11,21);
        System.out.println(pe);

        List<Person> per=personRepository.findByIdAndAge(11,22);
        System.out.println(per);

        List<Person> age=personRepository.findByAgeLessThan(23);
        System.out.println(age);

        List<Person> age_gt=personRepository.findByAgeGreaterThan(29);
        System.out.println(age_gt);

        List<Person> fn_like=personRepository.findByFirstNameLike("peter");
        System.out.println(fn_like);

        List<Person> id_between=personRepository.findByIdBetween(11,15);
        System.out.println(id_between);

        List<Person> fn_not=personRepository.findByFirstNameNot("peter");
        System.out.println(fn_not);

        List<Person> age_in=personRepository.findByAgeIn(Arrays.asList(28,29,30));
        System.out.println(age_in);*/


        //Jpa critera Api gt
        /*PersonJPARepository personJPARepository = applicationContext.getBean(PersonJPARepository.class);
        Specification<Person> personSpecification=new Specification<Person>() {
            @Override
            public Predicate toPredicate(Root<Person> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                Path path=root.get("age");
                Predicate predicate=cb.gt(path,25);
                return predicate;
            }
        };
        System.out.println(personJPARepository.findAll(personSpecification));
*/
        //jpa criteria api lt
        /*PersonJPARepository personJPARepository1=applicationContext.getBean(PersonJPARepository.class);
        Specification<Person> personSpecification1=new Specification<Person>() {
            @Override
            public Predicate toPredicate(Root<Person> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                Path path=root.get("id");
                Predicate predicate=cb.lessThan(path,4);
                return predicate;
            }
        };
        System.out.println(personJPARepository1.findAll(personSpecification1));*/


        //jpa criteria api or
        /*PersonJPARepository personJPARepository=applicationContext.getBean(PersonJPARepository.class);
        Specification<Person> personSpecification=new Specification<Person>() {
            @Override
            public Predicate toPredicate(Root<Person> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                Path p1=root.get("firstName");
                Path p2=root.get("lastName");
                Path p3=root.get("age");
                //Predicate predicate=cb.and(cb.equal(p1,"peter"),cb.equal(p2,"parker"));
                Predicate predicate=cb.or(cb.equal(p1,"first1"),cb.lt(p3,22));
                return  predicate;

            }
        };
        System.out.println(personJPARepository.findAll(personSpecification));*/

        //sorting without class

        /*List<Person> personList = personRepository.findByFirstNameOrderByAgeAsc("peter");
        System.out.println(personList);
*/

        //sorting with class
        /*List<Person> sort_person=personRepository.findAll(new Sort(Sort.Direction.ASC,"age"));
        System.out.println(sort_person);*/

        /*Page<Person> personPage= personRepository.findAll(new PageRequest(0,5,new Sort(Sort.Direction.ASC,"id")));
        Page<Person> personPage1=personRepository.findAll(new PageRequest(1,5,new Sort(Sort.Direction.ASC, "id")));
        List<Person> personList=personPage.getContent();
        List<Person> personList1=personPage.getContent();
        System.out.println(personList);
        System.out.println(personList1);*/


    }

}

