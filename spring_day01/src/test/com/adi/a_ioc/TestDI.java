package com.adi.a_ioc;
import com.adi.b_di.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @Description:
 * @Auther: Adi
 * @Date: 2018/9/27 15:13
 */
public class TestDI {
    @Test
    public void demo2(){
        
        /** 
         * @Description:
         * @Auther: Adi 
         * @Date: 2018/9/29 18:16
         * @param []
         * @return void
         */
        //从spring容器获得
        //1.获得容器
        String xmlPath= "com/adi/b_di/beans.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        //2.获得内容--不需要自己new，都是从spring容器获得
        BookService bookService=(BookService)applicationContext.getBean("BookserviceId");
        System.out.println(applicationContext.getId());
        bookService.addBook();
    }
}
