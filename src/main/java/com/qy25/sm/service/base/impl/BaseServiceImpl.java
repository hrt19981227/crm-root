package com.qy25.sm.service.base.impl;

import com.github.pagehelper.PageInfo;
import com.qy25.sm.entity.SupplierExample;
import com.qy25.sm.mapper.base.BaseMapper;
import com.qy25.sm.service.base.BaseService;
import com.qy25.sm.utils.ReflectionUtils;
import com.qy25.sm.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class BaseServiceImpl<T, ID> implements BaseService<T, ID> {
    @Autowired
    private BaseMapper<T, ID> baseMapper;

    @Override
    public PageVo<T> findPage() {
        List<T> list = baseMapper.selectByExample(null);
        return setPageVo(list);
    }

    @Override
    public PageVo<T> findPage(Object example) {
        List<T> list = baseMapper.selectByExample(example);
        return setPageVo(list);
    }

    @Override
    public T findById(ID id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addEntity(T entity) {
        ReflectionUtils.invokeMethod(entity,"setData",null,null);
        return baseMapper.insert(entity);
    }

    @Override
    public int updateEntity(T entity) {
        ReflectionUtils.invokeMethod(entity,"setData",null,null);
        return baseMapper.updateByPrimaryKey(entity);
    }

    @Override
    public int deleteById(ID id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional
    public int batchAddEntity(List<T> list) {
        list.forEach(item -> {
            baseMapper.insert(item);
        });
        return 1;
    }

    @Override
    @Transactional
    public int batchUpdateEntity(List<T> list) {
        list.forEach(item -> {
            baseMapper.updateByPrimaryKey(item);
        });
        return 1;
    }

    @Override
    @Transactional
    public int batchDeleteIds(List<ID> ids) {
        ids.forEach(id -> {
            baseMapper.deleteByPrimaryKey(id);
        });
        return 1;
    }

    @Override
    public PageVo<T> setPageVo(List<T> list) {
        PageInfo<T> pageInfo = new PageInfo<>(list);
        long total = pageInfo.getTotal();
        PageVo<T> pageVo = new PageVo();
        pageVo.setTotal(total);
        pageVo.setList(list);
        return pageVo;
    }
}
