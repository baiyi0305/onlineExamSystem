package com.wxs.oes.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxs.oes.domain.Message;
import com.wxs.oes.service.MessageService;
import com.wxs.oes.mapper.MessageMapper;
import org.springframework.stereotype.Service;

/**
* @author Adolph
* @description 针对表【message(留言表)】的数据库操作Service实现
* @createDate 2022-03-31 14:18:15
*/
@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message>
    implements MessageService{

}




