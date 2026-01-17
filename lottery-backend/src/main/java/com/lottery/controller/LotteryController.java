package com.lottery.controller;

import com.lottery.algorithm.BetCalculator;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Lottery Controller - Demo endpoints
 */
@RestController
@RequestMapping("/api/lottery")
public class LotteryController {

    @PostMapping("/calculate/double-color-ball")
    public Map<String, Object> calculateDoubleColorBall(@RequestBody Map<String, Integer> params) {
        int redCount = params.get("redCount");
        int blueCount = params.get("blueCount");

        int betCount = BetCalculator.calculateDoubleColorBall(redCount, blueCount);
        BigDecimal betAmount = new BigDecimal("2"); // 2 yuan per bet
        BigDecimal totalAmount = betAmount.multiply(new BigDecimal(betCount));

        Map<String, Object> result = new HashMap<>();
        result.put("betCount", betCount);
        result.put("totalAmount", totalAmount);
        result.put("message", "Calculation completed");

        return result;
    }

    @PostMapping("/calculate/football")
    public Map<String, Object> calculateFootball(@RequestBody Map<String, int[]> params) {
        int[] selections = params.get("selections");

        int betCount = BetCalculator.calculateFootballLottery(selections);
        BigDecimal betAmount = new BigDecimal("2");
        BigDecimal totalAmount = betAmount.multiply(new BigDecimal(betCount));

        Map<String, Object> result = new HashMap<>();
        result.put("betCount", betCount);
        result.put("totalAmount", totalAmount);
        result.put("message", "Calculation completed");

        return result;
    }

    @PostMapping("/calculate/prize")
    public Map<String, Object> calculatePrize(@RequestBody Map<String, Object> params) {
        BigDecimal betAmount = new BigDecimal(params.get("betAmount").toString());
        List<Double> oddsList = (List<Double>) params.get("odds");

        List<BigDecimal> odds = new ArrayList<>();
        for (Double odd : oddsList) {
            odds.add(new BigDecimal(odd.toString()));
        }

        BigDecimal prize = BetCalculator.calculatePrize(betAmount, odds);

        Map<String, Object> result = new HashMap<>();
        result.put("prize", prize);
        result.put("message", "Prize calculated");

        return result;
    }

    @GetMapping("/demo/matches")
    public List<Map<String, Object>> getDemoMatches() {
        List<Map<String, Object>> matches = new ArrayList<>();

        Map<String, Object> match1 = new HashMap<>();
        match1.put("id", 1);
        match1.put("homeTeam", "Manchester United");
        match1.put("awayTeam", "Liverpool");
        match1.put("homeOdds", "2.1");
        match1.put("drawOdds", "3.2");
        match1.put("awayOdds", "3.5");
        matches.add(match1);

        Map<String, Object> match2 = new HashMap<>();
        match2.put("id", 2);
        match2.put("homeTeam", "Barcelona");
        match2.put("awayTeam", "Real Madrid");
        match2.put("homeOdds", "1.8");
        match2.put("drawOdds", "3.0");
        match2.put("awayOdds", "4.2");
        matches.add(match2);

        return matches;
    }
}
