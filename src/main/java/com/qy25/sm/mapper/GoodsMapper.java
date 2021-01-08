package com.qy25.sm.mapper;

import com.qy25.sm.entity.sold.Goods;
import com.qy25.sm.mapper.base.BaseMapper;

import java.util.List;


public interface GoodsMapper extends BaseMapper<Goods,Long> {
    List<Goods> selectByStorageId(Long id);
}
