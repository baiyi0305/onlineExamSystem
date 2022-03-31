package com.wxs.oes.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxs.oes.domain.Admin;
import com.wxs.oes.service.AdminService;
import com.wxs.oes.mapper.AdminMapper;
import org.springframework.stereotype.Service;

/**
* @author Adolph
* @description 针对表【admin(管理员信息表)】的数据库操作Service实现
* @createDate 2022-03-31 14:17:22
*/
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin>
    implements AdminService{

}




