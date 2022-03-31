package com.wxs.oes.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 考试管理表
 * </p>
 *
 * @author Adolph
 * @since 2022-03-31
 */
@Data
@TableName("exam_manage")
public class ExamManage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 考试编号
     */
    @TableId(value = "examCode", type = IdType.AUTO)
    private Integer examCode;

    /**
     * 该次考试介绍
     */
    private String description;

    /**
     * 课程名称
     */
    private String source;

    /**
     * 试卷编号
     */
    private Integer paperId;

    /**
     * 考试日期
     */
    private String examDate;

    /**
     * 持续时长
     */
    private Integer totalTime;

    /**
     * 年级
     */
    private String grade;

    /**
     * 学期
     */
    private String term;

    /**
     * 专业
     */
    private String major;

    /**
     * 学院
     */
    private String institute;

    /**
     * 总分
     */
    private Integer totalScore;

    /**
     * 考试类型
     */
    private String type;

    /**
     * 考生须知
     */
}
