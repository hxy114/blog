package com.example.commuinte_backed.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.commuinte_backed.mapper.BmsPromotionMapper;
import com.example.commuinte_backed.model.entity.BmsPromotion;
import com.example.commuinte_backed.service.IBmsPromotionService;
import org.springframework.stereotype.Service;


@Service
public class IBmsPromotionServiceImpl extends ServiceImpl<BmsPromotionMapper, BmsPromotion> implements IBmsPromotionService {

}