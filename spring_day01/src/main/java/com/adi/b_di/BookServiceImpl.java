package com.adi.b_di;

import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * @Description:
 * @Auther: Adi
 * @Date: 2018/9/27 14:53
 */
public class BookServiceImpl implements BookService {
    //方式1：接口=实现类
    // private BookDao bookDao=new BookDaoImpl();

    //方式2：接口+setter
    private BookDao bookDao;


    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void addBook(){
        this.bookDao.save();
    }


}
