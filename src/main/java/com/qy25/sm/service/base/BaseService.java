package com.qy25.sm.service.base;

import com.qy25.sm.vo.PageVo;

import java.util.List;

public interface BaseService<T, ID> {

    /**
     * 分页查询
     *
     * @return
     */
    PageVo<T> findPage();

    /**
     * 有条件的查询
     */
    PageVo<T> findPage(Object example);

    /**
     * 通过id查询
     */
    T findById(ID id);

    /**
     * 添加操作
     */
    int addEntity(T entity);

    /**
     * 修改操作
     */
    int updateEntity(T entity);

    /**
     * 删除操作
     */
    int deleteById(ID id);

    /**
     * 批量添加
     */
    int batchAddEntity(List<T> list);

    /**
     * 批量修改
     */
    int batchUpdateEntity(List<T> list);

    /**
     * 批量删除
     */
    int batchDeleteIds(List<ID> ids);

    /**
     * 封装分页数据
     */
    PageVo<T> setPageVo(List<T> list);

}
