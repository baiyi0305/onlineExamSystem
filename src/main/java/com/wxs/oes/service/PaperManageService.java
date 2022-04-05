package com.wxs.oes.service;

import com.wxs.oes.domain.PaperManage;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
* @author Adolph
* @description 针对表【paper_manage(试卷管理表)】的数据库操作Service
* @createDate 2022-03-31 14:18:15
*/
public interface PaperManageService extends IService<PaperManage> {

    /**
     * 根据试卷id获取试卷详细信息
     * @param paperId 试卷id
     * @return
     */
    Map<Integer, List<?>> getAllByPaperId(Integer paperId);

}
