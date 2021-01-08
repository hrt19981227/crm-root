package com.qy25.sm.service.impl;


import com.qy25.sm.entity.sold.Storage;
import com.qy25.sm.service.StorageService;
import com.qy25.sm.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StorageServiceImpl extends BaseServiceImpl<Storage,Long> implements StorageService {
}
