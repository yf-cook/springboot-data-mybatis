package com.cn.springboot.mapper2;

import com.cn.springboot.bean.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Student2Mapper {

    public List<Student> getAllStudent();
}
