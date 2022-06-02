package ru.kostkin.spring.demospringv2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static ru.kostkin.spring.demospringv2.aspects.LoggingAspect.log;


public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("universityBean", University.class);
        university.addStudents();
        try {
            List<Student> students = university.getStudents();
            System.out.println(students);
        } catch (Exception e) {
            log.debug("An exception was caught " + e);
        }


        context.close();
    }
}
