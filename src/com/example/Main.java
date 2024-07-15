package com.example;

import com.example.service.TradeExecutor;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TradeExecutor tradeExecutor = new TradeExecutor();
        try (Scanner scanner = new Scanner(System.in)) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

            System.out.println("Enter date and time (yyyy-MM-dd HH:mm) or type 'now' to use the current date and time:");
            String input = scanner.nextLine();

            LocalDateTime dateTime;
            if (input.equalsIgnoreCase("now")) {
                dateTime = LocalDateTime.now(ZoneId.of("UTC"));
            } else {
                dateTime = LocalDateTime.parse(input, formatter);
            }

            tradeExecutor.executeTrade(dateTime);
        }
    }
}
