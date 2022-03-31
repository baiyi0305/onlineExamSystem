package com.wxs.oes.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 试卷管理表
 * </p>
 *
 * @author Adolph
 * @since 2022-03-31
 */
@Data
@TableName("paper_manage")
public class PaperManage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 试卷编号
     */
    private Integer paperId;

    /**
     * 题目类型
     */
    private Integer questionType;

    /**
     * 题目编号
     */
    private Integer questionId;
}
