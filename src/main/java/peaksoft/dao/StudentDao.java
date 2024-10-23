package peaksoft.dao;

import peaksoft.entity.Student;

import java.util.List;

public interface StudentDao {
    String saveStudent(Student student);

    String assignStudentByCourseId(Long studentId, Long courseId);

    // TODO crud method     getAllLessonByStudent()

}
