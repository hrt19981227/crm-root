package com.qy25.sm.entity.base;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class BaseEntity {
    private Long id;
    private LocalDateTime addTime;

    private Long creatorId;

    private LocalDateTime updateTime;

    private Long updateId;

    private void setData(){
        if (id == null){
            this.addTime = LocalDateTime.now();
            this.creatorId = 1L;
        } else {
            this.updateTime = LocalDateTime.now();
            this.updateId = 2L;
        }
    }
}
