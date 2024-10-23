package peaksoft.service;

import peaksoft.entity.Student;

import java.util.List;

public interface StudentService {

    String saveStudent(Student student);

    String assignStudentByCourseId(Long studentId, Long courseId);



}
