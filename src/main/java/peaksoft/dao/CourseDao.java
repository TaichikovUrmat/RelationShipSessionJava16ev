package peaksoft.dao;

import peaksoft.entity.Course;

public interface CourseDao {


    // TODO  Add
    String saveCourse(Course course);
    //    // TODO  countOfStudentByCourseId
    int countOfStudentByCourseId(Long courseId);

    // TODO  CRUD.   and Sord  price and desc

}
