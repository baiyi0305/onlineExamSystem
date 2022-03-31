package com.wxs.oes.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxs.oes.domain.Score;
import com.wxs.oes.service.ScoreService;
import com.wxs.oes.mapper.ScoreMapper;
import org.springframework.stereotype.Service;

/**
* @author Adolph
* @description 针对表【score(成绩管理表)】的数据库操作Service实现
* @createDate 2022-03-31 14:18:15
*/
@Service
public class ScoreServiceImpl extends ServiceImpl<ScoreMapper, Score>
    implements ScoreService{

}




