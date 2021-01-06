package com.qy25.sm.service;

import com.qy25.sm.entity.Category;
import com.qy25.sm.service.base.BaseService;

import java.util.List;

public interface CategoryService extends BaseService<Category,Long> {
    List<Category> getTreeData();
}
