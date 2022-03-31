package com.wxs.oes.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 填空题题库
 * </p>
 *
 * @author Adolph
 * @since 2022-03-31
 */
@Data
@TableName("fill_question")
public class FillQuestion implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 试题编号
     */
    @TableId(value = "questionId", type = IdType.AUTO)
    private Integer questionId;

    /**
     * 考试科目
     */
    private String subject;

    /**
     * 试题内容
     */
    private String question;

    /**
     * 正确答案
     */
    private String answer;

    /**
     * 题目解析
     */
    private String analysis;

    /**
     * 分数
     */
    private Integer score;

    /**
     * 难度等级
     */
    private String level;

    /**
     * 所属章节
     */
    private String section;
}
