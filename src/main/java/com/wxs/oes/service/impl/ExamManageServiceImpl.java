package com.wxs.oes.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxs.oes.domain.ExamManage;
import com.wxs.oes.service.ExamManageService;
import com.wxs.oes.mapper.ExamManageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author Adolph
* @description 针对表【exam_manage(考试管理表)】的数据库操作Service实现
* @createDate 2022-03-31 14:18:15
*/
@Service
public class ExamManageServiceImpl extends ServiceImpl<ExamManageMapper, ExamManage>
    implements ExamManageService{

    @Autowired
    ExamManageMapper examManageMapper;

    @Override
    public List<ExamManage> getAllExam(String key) {
            QueryWrapper<ExamManage> wrapper = new QueryWrapper<ExamManage>().like("source", key);
            return examManageMapper.selectList(wrapper);

    }

    @Override
    public IPage<ExamManage> getAllExamByPage(Integer pageCurrent, Integer pageSize) {
        IPage<ExamManage> page = new Page<>(pageCurrent,pageSize);
        return examManageMapper.selectPage(page, null);
    }

}




