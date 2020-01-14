package com.ycl.springdemo.controller;

import com.ycl.springdemo.entity.Student;
import com.ycl.springdemo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class StudentController {

    /**@Autowired 注释，它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作。 通过 @Autowired的使用来消除 set ，get方法。在使用@Autowired之前，我们对一个bean配置起属性时，是这用用的

    <property name="属性名" value=" 属性值"/>
    通过这种方式来，配置比较繁琐，而且代码比较多。在Spring 2.5 引入了 @Autowired 注释**/
    @Autowired
    private StudentService studentService;

    @RequestMapping({"/getAllStudent"})
    @ResponseBody
    public String getAllStudent(@RequestParam(name = "param",defaultValue = "param") String param ){
        List<Student> result =this.studentService.selectAllStudent();
        System.out.println(result.get(0));
        return "Hello"+param+",共找到"+result.size()+"个结果";
    }
}
