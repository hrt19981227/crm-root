package com.qy25.sm.service.impl;

import com.qy25.sm.entity.Category;
import com.qy25.sm.mapper.CategoryMapper;
import com.qy25.sm.service.CategoryService;
import com.qy25.sm.service.base.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CategoryServiceImpl extends BaseServiceImpl<Category, Long> implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getTreeData() {
        //查询所有
        List<Category> list = categoryMapper.selectByExample(null);
        //过滤出一级数据
        List<Category> root = list.stream().filter(item -> item.getParentId().equals(0L)).collect(Collectors.toList());
        root.forEach(item -> {
            getChildren(list, item);
        });
        return root;
    }

    public void getChildren(List<Category> categories, Category category) {
        List<Category> childrenList = categories.stream().filter(item -> item.getParentId().equals(category.getId())).collect(Collectors.toList());
        if (childrenList.size() > 0) {
            category.setChildren(childrenList);
            childrenList.forEach(item -> {
                getChildren(categories, item);
            });
        }
    }
}
