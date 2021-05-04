package com.example.commuinte_backed.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.commuinte_backed.mapper.BmsBillboardMapper;
import com.example.commuinte_backed.mapper.BmsTipMapper;
import com.example.commuinte_backed.model.entity.BmsBillboard;
import com.example.commuinte_backed.model.entity.BmsTip;
import com.example.commuinte_backed.service.IBmsBillboardService;
import com.example.commuinte_backed.service.IBmsTipService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class IBmsTipServiceImpl extends ServiceImpl<BmsTipMapper
        , BmsTip> implements IBmsTipService {

    @Override
    public BmsTip getRandomTip() {
        BmsTip todayTip = null;
        try {
            todayTip = this.baseMapper.getRandomTip();
        } catch (Exception e) {
            log.info("tip转化失败");
        }
        return todayTip;
    }
}