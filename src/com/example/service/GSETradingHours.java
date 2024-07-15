package com.example.service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.DayOfWeek;

public class GSETradingHours {
    private final LocalTime REGULAR_OPEN = LocalTime.of(10, 0);
    private final LocalTime REGULAR_CLOSE = LocalTime.of(15, 0);
    private final LocalTime PRE_OPEN = LocalTime.of(9, 30);
    private final LocalTime PRE_CLOSE = LocalTime.of(10, 0);

    public boolean isWithinTradingHours(LocalDateTime dateTime) {
        DayOfWeek day = dateTime.getDayOfWeek();
        LocalTime time = dateTime.toLocalTime();
        
        if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
            return false;
        }
        
        return (time.isAfter(PRE_OPEN) && time.isBefore(PRE_CLOSE)) ||
               (time.equals(PRE_OPEN) || time.equals(PRE_CLOSE)) ||
               (time.isAfter(REGULAR_OPEN) && time.isBefore(REGULAR_CLOSE)) ||
               (time.equals(REGULAR_OPEN) || time.equals(REGULAR_CLOSE));
    }

    public boolean isSpecialTradingSession(LocalDateTime dateTime) {
        // Implement special trading session logic here
        return false;
    }
}
