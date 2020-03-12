package com.cn.springboot.mapper1;

import com.cn.springboot.bean.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface Student1Mapper {
    public List<Student> getAllStudent();
}
