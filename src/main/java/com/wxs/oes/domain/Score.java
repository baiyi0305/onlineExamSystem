package com.wxs.oes.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 成绩管理表
 * </p>
 *
 * @author Adolph
 * @since 2022-03-31
 */
@Data
public class Score implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分数编号
     */
    @TableId(value = "scoreId", type = IdType.AUTO)
    private Integer scoreId;

    /**
     * 考试编号
     */
    private Integer examCode;

    /**
     * 学号
     */
    private Integer studentId;

    /**
     * 课程名称
     */
    private String subject;

    /**
     * 平时成绩
     */
    private Integer ptScore;

    /**
     * 期末成绩
     */
    private Integer etScore;

    /**
     * 总成绩
     */
    private Integer score;

    /**
     * 答题日期
     */
    private String answerDate;
}
