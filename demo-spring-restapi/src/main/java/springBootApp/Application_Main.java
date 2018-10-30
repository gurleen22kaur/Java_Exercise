package springBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springBootApp.entity.Student;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableJpaRepositories("springBootApp.repository")
@EntityScan("springBootApp.entity")
public class Application_Main {
    public static void main(String[] args) {
        SpringApplication.run(Application_Main.class, args);
        System.out.println("Application is up");




    }
}
