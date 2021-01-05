package com.qy25.sm.controller;

import com.github.pagehelper.PageHelper;
import com.qy25.sm.common.http.AxiosResult;
import com.qy25.sm.controller.base.BaseController;
import com.qy25.sm.entity.Brand;
import com.qy25.sm.service.BrandService;
import com.qy25.sm.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("brand")
public class BrandController extends BaseController {
    @Autowired
    private BrandService brandService;
    @GetMapping
    public AxiosResult<PageVo<Brand>> findPage(@RequestParam(defaultValue = "1") int currentPage,
                                           @RequestParam(defaultValue = "5") int pageSize) {

        PageHelper.startPage(currentPage, pageSize);
        PageVo<Brand> page = brandService.findPage();
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<Brand> findById(@PathVariable Long id) {
        Brand byId = brandService.findById(id);
        return AxiosResult.success(byId);
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Brand entity) {
        return toAxios(brandService.addEntity(entity));
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Brand entity) {
        return toAxios(brandService.updateEntity(entity));
    }

    @DeleteMapping("{id}")
    public AxiosResult<Void> deleteEntity(@PathVariable Long id) {
        return toAxios(brandService.deleteById(id));

    }
}
