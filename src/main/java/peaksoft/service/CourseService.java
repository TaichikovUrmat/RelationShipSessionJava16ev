package peaksoft.service;

import peaksoft.entity.Course;

public interface CourseService {
     // TODO  Add
    String saveCourse(Course course);

    //    // TODO  countOfStudentByCourseId
    int countOfStudentByCourseId(Long courseId);



//    // TODO  getCourseById
//    Course getCourseById(Long courseId);
//    // TODO  updateCourse
//    String updateCourse(Long courseId, Course newCourse);
//    // TODO  deleteCourse
//    String deleteCourse(Long courseId);
//    // TODO  getAllCourse
//    List<Course> getAllCourse();

//    // TODO  deleteAllStudentByCourseId
//    void deleteAllStudentByCourseId(Long courseId);

}
