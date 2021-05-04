package com.example.commuinte_backed.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.commuinte_backed.model.entity.BmsTip;
import org.springframework.stereotype.Repository;

@Repository
public interface BmsTipMapper extends BaseMapper<BmsTip> {
    BmsTip getRandomTip();
}