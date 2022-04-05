package com.wxs.oes.controller;


import com.wxs.oes.service.FillQuestionService;
import com.wxs.oes.service.JudgeQuestionService;
import com.wxs.oes.service.MultiQuestionService;
import com.wxs.oes.service.PaperManageService;
import com.wxs.oes.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 试卷管理表 前端控制器
 * </p>
 *
 * @author Adolph
 * @since 2022-03-31
 */
@RestController
@RequestMapping("/oes/paperManage")
public class PaperManageController {

    @Autowired
    PaperManageService paperManageService;

    @GetMapping("/getPaper/{paperId}")
    public R<Map<Integer, List<?>>> getPaperByPaperId(@PathVariable("paperId") Integer paperId){
        Map<Integer, List<?>> map = paperManageService.getAllByPaperId(paperId);
        if (map == null){
            return new R<>(500,"请求失败",null);
        }
        return new R<>(200,"请求成功",map);
    }
}
