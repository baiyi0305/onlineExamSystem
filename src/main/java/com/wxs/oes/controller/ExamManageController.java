package com.wxs.oes.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.wxs.oes.domain.ExamManage;
import com.wxs.oes.service.ExamManageService;
import com.wxs.oes.constant.PageParams;
import com.wxs.oes.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 通过examCode获取试卷的信息
     * @param examCode
     * @return
     */
    @GetMapping("/exam/{examCode}")
    public R<ExamManage> getExamDetail(@PathVariable("examCode") Integer examCode){
        ExamManage examManage = examManageService.getExamByExamCode(examCode);
        if (examManage == null){
            return new R<>(500,"请求失败",null);
        }
        return new R<>(200,"请求成功",examManage);
    }

    /**
     * 试卷检索
     * @param key 试卷关键字
     * @return
     */
    @GetMapping("/exams")
    public R<List<ExamManage>> getAllExam(String key){
        if (StringUtils.isNotEmpty(key)){
            List<ExamManage> examManages = examManageService.getAllExam(key);
            if (examManages == null){
                return new R<>(500,"没有考试",null);
            }
            return new R<>(200,"加载成功",examManages);
        }
        List<ExamManage> allExamByPage = examManageService.getAllExamByPage(PageParams.pageCurrent, PageParams.pageSize).getRecords();
        if (allExamByPage == null){
            return new R<>(500,"没有考试",null);
        }
        return new R<>(200,"加载成功",allExamByPage);
    }

    /**
     * 分页查询考试管理表
     * @param pageCurrent 当前第几页
     * @param pageSize 每页几条数据
     * @return
     */
    @GetMapping("/exams/{pageCurrent}/{pageSize}")
    public R<IPage<ExamManage>> getAllExamByPage(@PathVariable("pageCurrent") Integer pageCurrent,
                                @PathVariable("pageSize") Integer pageSize){
        IPage<ExamManage> examManages = examManageService.getAllExamByPage(pageCurrent,pageSize);
        if (examManages == null){
            return new R<>(500,"请求失败",null);
        }
        return new R<>(200,"请求成功",examManages);
    }

}
