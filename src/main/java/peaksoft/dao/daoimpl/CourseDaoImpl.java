package peaksoft.dao.daoimpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import peaksoft.config.HibernateConfig;
import peaksoft.dao.CourseDao;
import peaksoft.entity.Course;

public class CourseDaoImpl implements CourseDao {

    EntityManagerFactory  entityManagerFactory = HibernateConfig.getEntityManager();


    @Override
    public String saveCourse(Course course) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(course);
        entityManager.getTransaction().commit();
        entityManager.close();
        return " Successfully saved the course.";
    }

    @Override
    public int countOfStudentByCourseId(Long courseId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
       Long  courseId1  = entityManager.createQuery("select count(s.id) from Student s  inner join s.courses sc" + " where sc.id = :courseId ",Long.class ).setParameter("courseId", courseId).getSingleResult();
        entityManager.getTransaction().commit();
        entityManager.close();
        return courseId1.intValue();
    }
}
