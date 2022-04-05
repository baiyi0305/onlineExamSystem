package com.wxs.oes.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 选择题题库表
 * </p>
 *
 * @author Adolph
 * @since 2022-03-31
 */
@Data
@TableName("multi_question")
public class MultiQuestion implements Serializable {

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
     * 问题题目
     */
    private String question;

    /**
     * 选项A
     */
    @TableField(value = "answerA")
    private String answerA;

    /**
     * 选项B
     */
    @TableField(value = "answerB")
    private String answerB;

    /**
     * 选项C
     */
    @TableField(value = "answerC")
    private String answerC;

    /**
     * 选项D
     */
    @TableField(value = "answerD")
    private String answerD;

    /**
     * 正确答案
     */
    @TableField(value = "rightAnswer")
    private String rightAnswer;

    /**
     * 题目解析
     */
    private String analysis;

    /**
     * 分数
     */
    private Integer score;

    /**
     * 所属章节
     */
    private String section;

    /**
     * 难度等级
     */
    private String level;
}
