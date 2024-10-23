package peaksoft.service.serviceImpl;

import peaksoft.dao.CourseDao;
import peaksoft.dao.daoimpl.CourseDaoImpl;
import peaksoft.entity.Course;
import peaksoft.service.CourseService;

public class CourseServiceImpl implements CourseService {

   private final CourseDao courseDao = new CourseDaoImpl();

    @Override
    public String saveCourse(Course course) {
        return courseDao.saveCourse(course);
    }

    @Override
    public int countOfStudentByCourseId(Long courseId) {
        return courseDao.countOfStudentByCourseId(courseId);
    }
}
