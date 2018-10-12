package com.adi.g_annotation_b_web;

import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Auther: Adi
 * @Date: 2018/10/1 19:35
 */
@Repository("studentDaoId")
public class StudentDaoImpl implements StudentDao{
    @Override
    public void save() {
        System.out.println("dao");
    }
}
