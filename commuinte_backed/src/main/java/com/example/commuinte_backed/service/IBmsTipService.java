package com.example.commuinte_backed.service;
import com.baomidou.mybatisplus.extension.service.IService;

import com.example.commuinte_backed.model.entity.BmsTip;

public interface IBmsTipService extends IService<BmsTip>{
    BmsTip getRandomTip();
}
