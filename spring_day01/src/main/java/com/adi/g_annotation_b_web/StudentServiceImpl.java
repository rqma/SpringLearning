package com.adi.g_annotation_b_web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Auther: Adi
 * @Date: 2018/10/1 19:21
 */
@Service
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    @Autowired
    @Qualifier("studentDaoId")
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void addStudent() {
        System.out.println("service");
        studentDao.save();
    }
}
