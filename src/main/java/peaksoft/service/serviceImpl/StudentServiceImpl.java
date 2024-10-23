package peaksoft.service.serviceImpl;

import peaksoft.dao.StudentDao;
import peaksoft.dao.daoimpl.StudentDaoImpl;
import peaksoft.entity.Student;
import peaksoft.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

     private final StudentDao studentDao = new StudentDaoImpl();

    @Override
    public String saveStudent(Student student) {
        return studentDao.saveStudent(student);
    }

    @Override
    public String assignStudentByCourseId(Long studentId, Long courseId) {
        return studentDao.assignStudentByCourseId(studentId, courseId);
    }
}
