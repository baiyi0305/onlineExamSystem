package com.wxs.oes.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxs.oes.domain.Student;
import com.wxs.oes.service.StudentService;
import com.wxs.oes.mapper.StudentMapper;
import org.springframework.stereotype.Service;

/**
* @author Adolph
* @description 针对表【student(学生信息表)】的数据库操作Service实现
* @createDate 2022-03-31 14:18:15
*/
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student>
    implements StudentService{

}




