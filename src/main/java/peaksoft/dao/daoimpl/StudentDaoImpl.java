package peaksoft.dao.daoimpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import peaksoft.config.HibernateConfig;
import peaksoft.dao.StudentDao;
import peaksoft.entity.Course;
import peaksoft.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

  EntityManagerFactory entityManagerFactory = HibernateConfig.getEntityManager();
    @Override
    public String saveStudent(Student student) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(student);
//        entityManager.merge(student);
        entityManager.getTransaction().commit();
        entityManager.close();
        return "success" ;
    }

    @Override
    public String assignStudentByCourseId(Long studentId, Long courseId) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Student student = entityManager.find(Student.class, studentId);

        List courseId1 = entityManager.createQuery("select c from Course c where c.id = :courseId")
                .setParameter("courseId", courseId).getResultList();

//        if (!(courseId1 == courseId)){
//           throw  new RuntimeException( " error curses  " + courseId);
//        }
//        if (!student.equals(studentId) ){
//           throw   new RuntimeException(  "  error student " +student );
//        }

        student.setCourses(courseId1);


        entityManager.getTransaction().commit();
        entityManager.close();
        return "Success ";
    }
}
