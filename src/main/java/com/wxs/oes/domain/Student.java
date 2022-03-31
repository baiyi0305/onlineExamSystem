package com.wxs.oes.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 学生信息表
 * </p>
 *
 * @author Adolph
 * @since 2022-03-31
 */
@Data
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "studentId", type = IdType.AUTO)
    private Integer studentId;

    /**
     * 姓名
     */
    @TableField(value = "studentName")
    private String studentName;

    /**
     * 年级
     */
    private String grade;

    /**
     * 专业
     */
    private String major;

    /**
     * 班级
     */
    private String clazz;

    /**
     * 学院
     */
    private String institute;

    /**
     * 电话号码
     */
    private String tel;

    /**
     * 电子邮件
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
     * 性别
     */
    private String sex;

    /**
     * 角色(0管理员，1教师，2学生)
     */
    private String role;

    @TableField(exist = false)
    private String token;
}
