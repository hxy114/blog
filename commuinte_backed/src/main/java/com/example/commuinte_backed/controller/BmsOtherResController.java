package com.example.commuinte_backed.controller;

import com.example.commuinte_backed.common.api.ApiResult;

import com.example.commuinte_backed.model.entity.BmsOtherRes;
import com.example.commuinte_backed.service.IBmsOtherResService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/otherres")
public class BmsOtherResController extends BaseController{
    @Resource
    private IBmsOtherResService bmsOtherResService;

    @GetMapping("/all")
    public ApiResult<List<BmsOtherRes>> list() {
        List<BmsOtherRes> list = bmsOtherResService.list();
        return ApiResult.success(list);
    }

}
