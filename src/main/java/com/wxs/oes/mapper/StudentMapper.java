package com.wxs.oes.mapper;

import com.wxs.oes.domain.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* @author Adolph
* @description 针对表【student(学生信息表)】的数据库操作Mapper
* @createDate 2022-03-31 14:18:15
* @Entity com.wxs.oes.domain.Student
*/
@Repository
public interface StudentMapper extends BaseMapper<Student> {

}




