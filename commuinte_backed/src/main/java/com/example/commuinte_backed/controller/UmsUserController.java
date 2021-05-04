package com.example.commuinte_backed.controller;

import com.example.commuinte_backed.common.api.ApiResult;
import com.example.commuinte_backed.model.dto.LoginByEmailDTO;
import com.example.commuinte_backed.model.dto.RegisterDTO;
import com.example.commuinte_backed.model.entity.UmsUser;
import com.example.commuinte_backed.service.IUmsUserService;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import com.example.commuinte_backed.model.dto.LoginByUserNameDTO;
import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import static com.example.commuinte_backed.jwt.JwtUtil.USER_NAME;


@RestController
@RequestMapping("/ums/user")
public class UmsUserController extends BaseController {
    @Resource
    private IUmsUserService iUmsUserService;

   // @RequestMapping(value = "/register", method = RequestMethod.POST)
    @PostMapping("/register")
    public ApiResult<Map<String, Object>> register(@Valid @RequestBody RegisterDTO dto) {
        UmsUser user = iUmsUserService.executeRegister(dto);
        if (ObjectUtils.isEmpty(user)) {
            return ApiResult.failed("账号注册失败");
        }
        Map<String, Object> map = new HashMap<>(16);
        map.put("user", user);
        return ApiResult.success(map);
    }
    @RequestMapping(value = "/loginbyusername", method = RequestMethod.POST)
    public ApiResult<Map<String, String>> loginByUserName(@Valid @RequestBody LoginByUserNameDTO dto) {
        String token = iUmsUserService.executeLoginByUserName(dto);
        if (ObjectUtils.isEmpty(token)) {
            return ApiResult.failed("账号密码错误");
        }
        Map<String, String> map = new HashMap<>(16);
        map.put("token", token);
        return ApiResult.success(map, "登录成功");
    }

    @RequestMapping(value = "/loginbyemail", method = RequestMethod.POST)
    public ApiResult<Map<String, String>> loginByEmail(@Valid @RequestBody LoginByEmailDTO dto) {
        String token = iUmsUserService.executeLoginByEmail(dto);
        if (ObjectUtils.isEmpty(token)) {
            return ApiResult.failed("邮箱密码错误");
        }
        Map<String, String> map = new HashMap<>(16);
        map.put("token", token);
        return ApiResult.success(map, "登录成功");

    }
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public ApiResult<UmsUser> getUser(@RequestHeader(value = USER_NAME) String userName) {
        UmsUser user = iUmsUserService.getUserByUsername(userName);
        return ApiResult.success(user);
    }



}