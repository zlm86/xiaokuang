package com.ycl.springdemo;

import com.ycl.springdemo.dao.StudentDao;
import com.ycl.springdemo.entity.Student;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;



@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringdemoApplicationTests {

    @Autowired
    private StudentDao studentDao;

    @Test
    public void SelectAllStudent(){
        List<Student> students =studentDao.selectAll();
        //Student student=(Student)students.get(0);


        System.out.println("Student:"+students.get(0));
    }

   @Test
    public void updateStudent(){
        Student student =studentDao.selectByName("user1");
        System.out.println("Student:"+student);
        if (student !=null){
           student.setName("wangwu2");
           student.setBirthday(new Date());
           studentDao.updateStudent(student);
           System.out.println("Student:"+student);
        }

    }

    @Test
    public void insertStudent(){
        Student student = new Student();
        student.setId("12345678912345678912345678912314");
        student.setName("wangwu2");
        student.setBirthday(new Date());
        student.setAge(23);
        System.out.println("Student:"+student);
        studentDao.insertStudent(student);
    }

    @Test
    public void contextLoads() {
        System.out.println("111");
    }

}
