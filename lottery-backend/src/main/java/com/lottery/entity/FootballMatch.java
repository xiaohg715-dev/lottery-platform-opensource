package com.lottery.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Football Match Entity
 */
@Data
@TableName("football_match")
public class FootballMatch {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String matchNo;

    private String homeTeam;

    private String awayTeam;

    private String league;

    private LocalDateTime matchTime;

    private String homeOdds; // Win odds

    private String drawOdds; // Draw odds

    private String awayOdds; // Lose odds

    private String result; // 3: home win, 1: draw, 0: away win

    private String status; // PENDING, FINISHED, CANCELLED

    private LocalDateTime createTime;
}
