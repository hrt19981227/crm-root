package com.qy25.sm.controller.base;

import com.qy25.sm.common.http.AxiosResult;

public class BaseController {




    public AxiosResult<Void> toAxios(int row) {
        return row > 0 ? AxiosResult.success() : AxiosResult.error();
    }
}
