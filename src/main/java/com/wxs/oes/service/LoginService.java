package com.wxs.oes.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxs.oes.domain.Login;
import com.wxs.oes.utils.R;

/**
 * @author:Adolph
 */
public interface LoginService extends IService<Login> {
    R<Object> login(Login login);

}
