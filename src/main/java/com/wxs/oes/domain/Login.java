package com.wxs.oes.domain;

import lombok.Data;

/**
 * @author:Adolph
 */
@Data
public class Login {

    /**
     * 账户
     */
    private String username;
    /**
     * 密码
     */
    private String password;
}
