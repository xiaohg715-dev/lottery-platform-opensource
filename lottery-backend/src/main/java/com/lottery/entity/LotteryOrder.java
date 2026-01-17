package com.lottery.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@TableName("lottery_order")
public class LotteryOrder {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String orderNo;
    private Long userId;
    private String lotteryType;
    private String betContent;
    private Integer betCount;
    private BigDecimal betAmount;
    private BigDecimal odds;
    private BigDecimal prizeAmount;
    private String status;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
