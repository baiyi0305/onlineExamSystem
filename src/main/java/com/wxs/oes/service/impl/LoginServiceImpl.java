package com.wxs.oes.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxs.oes.domain.Admin;
import com.wxs.oes.domain.Login;
import com.wxs.oes.domain.Student;
import com.wxs.oes.domain.Teacher;
import com.wxs.oes.mapper.AdminMapper;
import com.wxs.oes.mapper.LoginMapper;
import com.wxs.oes.mapper.StudentMapper;
import com.wxs.oes.mapper.TeacherMapper;
import com.wxs.oes.service.LoginService;
import com.wxs.oes.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
* @author Adolph
* @description 针对表【admin(管理员信息表)】的数据库操作Service实现
* @createDate 2022-03-31 14:17:22
*/
@Service
public class LoginServiceImpl extends ServiceImpl<LoginMapper, Login>
    implements LoginService {

    @Autowired
    AdminMapper adminMapper;

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public R<?> login(Login login) {
        String username = login.getUsername();
        String password = login.getPassword();
        Admin admin = adminMapper.selectOne(new QueryWrapper<Admin>().eq("adminId", username)
                .eq("pwd", password));
        if (admin != null){
            //设置token，先使用uuid，以后在使用jwt
            admin.setToken(UUID.randomUUID().toString());
            return new R<>(200,"请求成功",admin);
        }

        Student student = studentMapper.selectOne(new QueryWrapper<Student>().eq("studentId", username)
                .eq("pwd", password));
        if (student != null){
            student.setToken(UUID.randomUUID().toString());
            return new R<>(200,"请求成功",student);
        }

        Teacher teacher = teacherMapper.selectOne(new QueryWrapper<Teacher>().eq("teacherId", username)
                .eq("pwd", password));
        if (teacher != null){
            teacher.setToken(UUID.randomUUID().toString());
            return new R<>(200,"请求成功",teacher);
        }
        return new R<>(500,"请求失败",null);
    }
}




