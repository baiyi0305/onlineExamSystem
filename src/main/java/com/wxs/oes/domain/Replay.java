package com.wxs.oes.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 回复表
 * </p>
 *
 * @author Adolph
 * @since 2022-03-31
 */
@Data
public class Replay implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 留言编号
     */
    private Integer messageId;

    /**
     * 回复编号
     */
    @TableId(value = "replayId", type = IdType.AUTO)
    private Integer replayId;

    /**
     * 内容
     */
    private String replay;

    /**
     * 回复时间
     */
    private LocalDate replayTime;
}
