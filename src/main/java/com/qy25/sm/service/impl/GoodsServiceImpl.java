package com.qy25.sm.service.impl;


import com.qy25.sm.entity.sold.Goods;
import com.qy25.sm.service.GoodsService;
import com.qy25.sm.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GoodsServiceImpl extends BaseServiceImpl<Goods,Long> implements GoodsService {
}
