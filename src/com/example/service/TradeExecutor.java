package com.example.service;

import java.time.LocalDateTime;

public class TradeExecutor {
    private GSETradingChecker tradingChecker;

    public TradeExecutor() {
        this.tradingChecker = new GSETradingChecker();
    }

    public void executeTrade(LocalDateTime dateTime) {
        if (tradingChecker.isMarketOpen(dateTime)) {
            System.out.println("Trade executed at " + dateTime);
        } else {
            System.out.println("Market is closed. Trade not executed.");
        }
    }
}
