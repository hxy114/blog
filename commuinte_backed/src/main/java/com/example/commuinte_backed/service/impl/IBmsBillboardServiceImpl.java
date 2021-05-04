package com.example.commuinte_backed.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.commuinte_backed.mapper.BmsBillboardMapper;
import com.example.commuinte_backed.model.entity.BmsBillboard;
import com.example.commuinte_backed.service.IBmsBillboardService;
import org.springframework.stereotype.Service;

@Service
public class IBmsBillboardServiceImpl extends ServiceImpl<BmsBillboardMapper
        , BmsBillboard> implements IBmsBillboardService {
}
