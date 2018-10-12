package com.adi.g_annotation_b_web;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudentAction {
    @Test
    public void demo2() throws Exception {
        String xmlPath= "com\\adi\\g_annotation_b_web\\beans.xml";
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        StudentAction action= (StudentAction) applicationContext.getBean("studentId");
        action.execute();
    }

}