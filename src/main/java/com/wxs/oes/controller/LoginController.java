package com.wxs.oes.controller;

import com.wxs.oes.domain.Login;
import com.wxs.oes.service.LoginService;
import com.wxs.oes.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author:Adolph
 */
@RestController
@RequestMapping("/oes")
public class LoginController {

    @Autowired
    LoginService loginService;

    /**
     * 登录验证
     * @param login 登录信息
     * @return
     */
    @PostMapping("/login")
    public R<?> login(@RequestBody Login login){
        return loginService.login(login);
    }

}
