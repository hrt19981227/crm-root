package com.qy25.sm.vo;

import lombok.Data;

import java.util.List;

@Data
public class PageVo<T> {
    private long total;
    private List<T> list;
}
