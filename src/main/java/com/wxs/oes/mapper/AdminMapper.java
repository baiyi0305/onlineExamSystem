package com.wxs.oes.mapper;

import com.wxs.oes.domain.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
* @author Adolph
* @description 针对表【admin(管理员信息表)】的数据库操作Mapper
* @createDate 2022-03-31 14:17:22
* @Entity com.wxs.oes.domain.Admin
*/
@Repository
public interface AdminMapper extends BaseMapper<Admin> {

}




