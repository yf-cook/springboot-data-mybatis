package com.cn.springboot.controller;

import com.cn.springboot.bean.Student;
import com.cn.springboot.mapper1.Student1Mapper;
import com.cn.springboot.mapper2.Student2Mapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class StudentController {
    @Resource
    private Student1Mapper student1Mapper;

    @Resource
    private Student2Mapper student2Mapper;
    @RequestMapping(value = "/test")
    public void test(){
       List<Student> allStudet1 = student1Mapper.getAllStudent();
        List<Student> allStudent2= student2Mapper.getAllStudent();
        System.out.println("student:"+allStudet1);
        System.out.println("student:"+allStudent2);
   }

   @RequestMapping("/testJsonStudent")
   public Student testJsonStudent(){
       Student student = new Student();
       student.setStudentId(5);
       student.setStudentName("老王");
       student.setStudentSex("女");
       return student;
   }

   @RequestMapping(value = "/index")
    public String index(){
        return "index";
   }

}
