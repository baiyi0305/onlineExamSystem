package com.wxs.oes.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxs.oes.domain.MultiQuestion;
import com.wxs.oes.service.MultiQuestionService;
import com.wxs.oes.mapper.MultiQuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author Adolph
* @description 针对表【multi_question(选择题题库表)】的数据库操作Service实现
* @createDate 2022-03-31 14:18:15
*/
@Service
public class MultiQuestionServiceImpl extends ServiceImpl<MultiQuestionMapper, MultiQuestion>
    implements MultiQuestionService{

}




