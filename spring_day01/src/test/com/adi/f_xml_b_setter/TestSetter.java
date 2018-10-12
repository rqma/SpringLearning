package com.adi.f_xml_b_setter;

import com.adi.e_lifecycle.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class TestSetter {
    @Test
    public void demo2() throws Exception {
        String xmlPath= "config\\beans.xml";
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        Person person= (Person) applicationContext.getBean("personId");
        System.out.println( person.toString());

    }

}