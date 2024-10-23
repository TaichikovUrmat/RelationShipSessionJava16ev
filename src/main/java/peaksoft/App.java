package peaksoft;


import peaksoft.entity.Course;
import peaksoft.entity.Student;
import peaksoft.service.CourseService;
import peaksoft.service.StudentService;
import peaksoft.service.serviceImpl.CourseServiceImpl;
import peaksoft.service.serviceImpl.StudentServiceImpl;

import java.time.LocalDate;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//    HibernateConfig.getEntityManager();
        StudentService studentService = new StudentServiceImpl();
        CourseService courseService = new CourseServiceImpl();
//        courseService.saveCourse(new Course("Js12",12000, LocalDate.of(2024,6,26)));
//        studentService.saveStudent(new Student("Atai","atai@gmail.com",2005));
//        studentService.saveStudent(new Student("Askat ","ackat@gmail.com",1988));
//        studentService.saveStudent(new Student("Babakhan","babakhan@gmail.com",1993));
//        studentService.saveStudent(new Student("Baisalbek","baisalbek@gmail.com",2006));
//        studentService.saveStudent(new Student("Nuradil","nuradil@gmail.com",1997));

//        System.out.println(studentService.assignStudentByCourseId(2L, 1L));
//        System.out.println(studentService.assignStudentByCourseId(3L, 2L));

        System.out.println(courseService.countOfStudentByCourseId(1L));


    }
}
