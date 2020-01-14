package com.ycl.springdemo.dao;

import com.ycl.springdemo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component
public interface StudentDao/* extends CrudRepository<Student, Integer>, JpaSpecificationExecutor<Student> */{
    public List<Student> selectAll();

    public void  insertStudent(Student student);

    public void  deleteStudent(String id);

    public void  updateStudent(Student student);

    public Student selectByName(String name);
}
