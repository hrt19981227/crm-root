package com.qy25.sm.service.impl;

import com.qy25.sm.entity.Supplier;
import com.qy25.sm.service.SupplierService;
import com.qy25.sm.service.base.BaseService;
import com.qy25.sm.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SupplierServiceImpl extends BaseServiceImpl<Supplier,Long> implements SupplierService {
}
