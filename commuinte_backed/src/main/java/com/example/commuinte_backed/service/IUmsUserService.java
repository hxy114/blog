package com.example.commuinte_backed.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.commuinte_backed.model.dto.LoginByEmailDTO;
import com.example.commuinte_backed.model.dto.RegisterDTO;
import com.example.commuinte_backed.model.entity.UmsUser;
import com.example.commuinte_backed.model.dto.LoginByUserNameDTO;

public interface IUmsUserService extends IService<UmsUser> {

    /**
     * 注册功能
     *
     * @param dto
     * @return 注册对象
     */
    UmsUser executeRegister(RegisterDTO dto);
    /**
     * 获取用户信息
     *
     * @param username
     * @return dbUser
     */
    UmsUser getUserByUsername(String username);
    /**
     * 用户登录
     *
     * @param dto
     * @return 生成的JWT的token
     */
    String executeLoginByUserName(LoginByUserNameDTO dto);

    String executeLoginByEmail(LoginByEmailDTO dto);


    UmsUser getUserByEmail(String username);

}