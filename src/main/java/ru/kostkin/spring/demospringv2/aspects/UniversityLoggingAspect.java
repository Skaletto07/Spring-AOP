package ru.kostkin.spring.demospringv2.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import ru.kostkin.spring.demospringv2.Student;

import java.util.List;

import static ru.kostkin.spring.demospringv2.aspects.LoggingAspect.log;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        log.debug("beforeGetStudentsLoggingAdvice: logging getting list of students before method getStudents()");
    }

    @AfterReturning(pointcut = "execution(* getStudents())",
    returning = "students")
    public void afterGetStudentsLoggingAdvice(List<Student> students) {
        Student firstStd = students.get(0);
        String nameSurname = firstStd.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        firstStd.setNameSurname(nameSurname);

        double avgGrade = firstStd.getAvgGrade();
        avgGrade += 1;
        firstStd.setAvgGrade(avgGrade);






        log.debug("afterGetStudentsLoggingAdvice: logging getting list of students after method getStudents()");
    }

}
