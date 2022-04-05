package com.wxs.oes.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wxs.oes.domain.ExamManage;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author Adolph
* @description 针对表【exam_manage(考试管理表)】的数据库操作Service
* @createDate 2022-03-31 14:18:15
*/
public interface ExamManageService extends IService<ExamManage> {

    /**
     * 获取所有试管理表数据
     * @param key 关键字
     * @return
     */
    List<ExamManage> getAllExam(String key);

    /**
     * 获取所有试管理表数据
     * @param pageCurrent 当前页
     * @param pageSize 每一页几条数据
     * @return
     */
    IPage<ExamManage> getAllExamByPage(Integer pageCurrent, Integer pageSize);

    /**
     * 通过examCode获取试卷概述信息
     * @param examCode 考试编号
     * @return 考试信息
     */
    ExamManage getExamByExamCode(Integer examCode);
}
