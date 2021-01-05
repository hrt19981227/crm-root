package com.qy25.sm.controller;

import com.github.pagehelper.PageHelper;
import com.qy25.sm.common.http.AxiosResult;
import com.qy25.sm.controller.base.BaseController;
import com.qy25.sm.entity.Supplier;
import com.qy25.sm.service.SupplierService;
import com.qy25.sm.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("supplier")
public class SupplierController extends BaseController {
    @Autowired
    private SupplierService supplierService;
    @GetMapping
    public AxiosResult<PageVo<Supplier>> findPage(@RequestParam(defaultValue = "1") int currentPage,
                                                  @RequestParam(defaultValue = "5") int pageSize) {

        PageHelper.startPage(currentPage, pageSize);
        PageVo<Supplier> page = supplierService.findPage();
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<Supplier> findById(@PathVariable Long id) {
        Supplier byId = supplierService.findById(id);
        return AxiosResult.success(byId);
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Supplier entity) {
        return toAxios(supplierService.addEntity(entity));
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Supplier entity) {
        return toAxios(supplierService.updateEntity(entity));
    }

    @DeleteMapping("{id}")
    public AxiosResult<Void> deleteEntity(@PathVariable Long id) {
        return toAxios(supplierService.deleteById(id));

    }
}
