package com.wxs.oes.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxs.oes.constant.QuestionType;
import com.wxs.oes.domain.FillQuestion;
import com.wxs.oes.domain.JudgeQuestion;
import com.wxs.oes.domain.MultiQuestion;
import com.wxs.oes.domain.PaperManage;
import com.wxs.oes.mapper.FillQuestionMapper;
import com.wxs.oes.mapper.JudgeQuestionMapper;
import com.wxs.oes.mapper.MultiQuestionMapper;
import com.wxs.oes.mapper.PaperManageMapper;
import com.wxs.oes.service.PaperManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
* @author Adolph
* @description 针对表【paper_manage(试卷管理表)】的数据库操作Service实现
* @createDate 2022-03-31 14:18:15
*/
@Service
public class PaperManageServiceImpl extends ServiceImpl<PaperManageMapper, PaperManage>
    implements PaperManageService{

    @Autowired
    PaperManageMapper paperManageMapper;
    @Autowired
    FillQuestionMapper fillQuestionMapper;
    @Autowired
    JudgeQuestionMapper judgeQuestionMapper;
    @Autowired
    MultiQuestionMapper multiQuestionMapper;

    @Override
    public Map<Integer, List<?>> getAllByPaperId(Integer paperId) {
        Map<Integer, List<?>> map = new HashMap<>();
        for (int questionType = 1; questionType < 4; questionType++) { //questionType为1、2、3
            List<?> detail = getDetail(paperId,questionType);
            map.put(questionType,detail);
        }
        return map;
    }

    /**
     * 获取考试详细信息
     * @param paperId 试卷id
     * @param questionType 题目id
     * @return
     */
    private List<?> getDetail(Integer paperId, Integer questionType){
        List<PaperManage> paperManageList = paperManageMapper.selectList(
                new QueryWrapper<PaperManage>()
                        .eq("paperId", paperId)
                            .eq("questionType",questionType));
        List<Integer> questIdList = paperManageList.stream()
                .map(PaperManage::getQuestionId)
                    .collect(Collectors.toList());
        if (QuestionType.MULTI_QUESTION.equals(questionType)){
            return multiQuestionMapper.selectList(new QueryWrapper<MultiQuestion>()
                    .in("questionId",questIdList));
        }else if (QuestionType.FILL_QUESTION.equals(questionType)){
            return fillQuestionMapper.selectList(new QueryWrapper<FillQuestion>()
                    .in("questionId",questIdList));
        }else {
            return judgeQuestionMapper.selectList(new QueryWrapper<JudgeQuestion>()
                    .in("questionId",questIdList));
        }
    }
}




