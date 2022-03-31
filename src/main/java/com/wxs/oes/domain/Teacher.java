package com.wxs.oes.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 教师信息表
 * </p>
 *
 * @author Adolph
 * @since 2022-03-31
 */
@Data
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "teacherId", type = IdType.AUTO)
    private Integer teacherId;

    /**
     * 姓名
     */
    @TableField(value = "teacherName")
    private String teacherName;

    /**
     * 学院
     */
    private String institute;

    /**
     * 性别
     */
    private String sex;

    /**
     * 电话号码
     */
    private String tel;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 身份证号
     */
    @TableField(value = "cardId")
    private String cardId;

    /**
     * 职称
     */
    private String type;

    /**
     * 角色（0管理员，1教师，2学生）
     */
    private String role;

    @TableField(exist = false)
    private String token;
}
