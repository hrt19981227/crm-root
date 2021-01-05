package com.qy25.sm.controller;

import com.github.pagehelper.PageHelper;
import com.qy25.sm.common.http.AxiosResult;
import com.qy25.sm.controller.base.BaseController;
import com.qy25.sm.entity.Category;
import com.qy25.sm.service.CategoryService;
import com.qy25.sm.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("category")
public class CategoryController extends BaseController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping
    public AxiosResult<PageVo<Category>> findPage(@RequestParam(defaultValue = "1") int currentPage,
                                               @RequestParam(defaultValue = "5") int pageSize) {

        PageHelper.startPage(currentPage, pageSize);
        PageVo<Category> page = categoryService.findPage();
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<Category> findById(@PathVariable Long id) {
        Category byId = categoryService.findById(id);
        return AxiosResult.success(byId);
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Category entity) {
        return toAxios(categoryService.addEntity(entity));
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Category entity) {
        return toAxios(categoryService.updateEntity(entity));
    }

    @DeleteMapping("{id}")
    public AxiosResult<Void> deleteEntity(@PathVariable Long id) {
        return toAxios(categoryService.deleteById(id));

    }
}
