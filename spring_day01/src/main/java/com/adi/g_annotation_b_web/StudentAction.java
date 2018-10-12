package com.adi.g_annotation_b_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Description:
 * @Auther: Adi
 * @Date: 2018/10/1 19:01
 */
@Controller("studentId")
public class StudentAction {

    @Autowired //默认按照类型
    private StudentService studentService;
    public void execute(){
        studentService.addStudent();
    }
}
