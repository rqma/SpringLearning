package com.adi.f_xml_e_coll;

import com.adi.f_xml_b_setter.Person;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class TestCollData {
    @Test
    public void demo2() throws Exception {
        String xmlPath= "config\\beans.xml";
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        CollData collData= (CollData) applicationContext.getBean("collId");
        System.out.println( collData.toString());
    }

}