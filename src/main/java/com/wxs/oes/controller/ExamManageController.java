package com.wxs.oes.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wxs.oes.domain.ExamManage;
import com.wxs.oes.service.ExamManageService;
import com.wxs.oes.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 考试管理表 前端控制器
 * </p>
 *
 * @author Adolph
 * @since 2022-03-31
 */
@RestController
@RequestMapping("/oes/examManage")
public class ExamManageController {

    @Autowired
    ExamManageService examManageService;

    @RequestMapping("/exams")
    public R<List<ExamManage>> getAllExam(){
        List<ExamManage> examManages = examManageService.getAllExam();
        if (examManages == null){
            return new R<>(500,"没有考试",null);
        }
        return new R<>(200,"加载成功",examManages);
    }

    /**
     * 分页查询考试管理表
     * @param pageCurrent 当前第几页
     * @param pageSize 每页几条数据
     * @return
     */
    @RequestMapping("/exams/{pageCurrent}/{pageSize}")
    public R<IPage<ExamManage>> getAllExamByPage(@PathVariable("pageCurrent") Integer pageCurrent,
                                @PathVariable("pageSize") Integer pageSize){
        IPage<ExamManage> examManages = examManageService.getAllExamByPage(pageCurrent,pageSize);
        if (examManages == null){
            return new R<>(500,"请求失败",null);
        }
        return new R<>(200,"请求成功",examManages);
    }

}
