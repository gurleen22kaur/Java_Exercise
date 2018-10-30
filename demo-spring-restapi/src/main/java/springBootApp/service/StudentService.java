package springBootApp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springBootApp.entity.Student;
import springBootApp.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    public StudentRepository studentRepository;

    public List<Student> getStudents()
    {
        System.out.println("create is running");
        return (List<Student>) studentRepository.findAll();

    }

    public List<Student> createStudent()
    {
        List<Student> students=new ArrayList<>();
        for(int i=1;i<=10;i++)
        {
            Student student=new Student("John"+i);
            students.add(student);

        }
        studentRepository.saveAll(students);
        return students;
    }

    public Student getById(Integer id){
        Optional<Student> optional=studentRepository.findById(id);
        return optional.isPresent() ? optional.get(): null;
    }


    public void saveStudent(Student student)
    {
        studentRepository.save(student);
    }

}
