package com.ycl.springdemo.services;

import com.ycl.springdemo.dao.StudentDao;
import com.ycl.springdemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public List<Student> selectAllStudent(){
        return  this.studentDao.selectAll();
    }


}
