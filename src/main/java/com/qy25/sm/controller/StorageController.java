package com.qy25.sm.controller;

import com.github.pagehelper.PageHelper;
import com.qy25.sm.common.http.AxiosResult;
import com.qy25.sm.controller.base.BaseController;
import com.qy25.sm.entity.sold.Storage;
import com.qy25.sm.service.StorageService;
import com.qy25.sm.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("storage")
public class StorageController extends BaseController {
    @Autowired
    private StorageService storageService;
    @GetMapping
    public AxiosResult<PageVo<Storage>> findPage(@RequestParam(defaultValue = "1") int currentPage,
                                                 @RequestParam(defaultValue = "5") int pageSize) {

        PageHelper.startPage(currentPage, pageSize);
        PageVo<Storage> page = storageService.findPage();
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<Storage> findById(@PathVariable Long id) {
        Storage byId = storageService.findById(id);
        return AxiosResult.success(byId);
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Storage entity) {
        return toAxios(storageService.addEntity(entity));
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Storage entity) {
        return toAxios(storageService.updateEntity(entity));
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteEntity(@PathVariable List<Long> ids) {
        return toAxios(storageService.batchDeleteIds(ids));

    }
}
