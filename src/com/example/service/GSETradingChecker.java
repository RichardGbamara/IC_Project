package com.example.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.DayOfWeek;

public class GSETradingChecker {
    private GhanaHolidayCalendar holidayCalendar;
    private GSETradingHours tradingHours;

    public GSETradingChecker() {
        this.holidayCalendar = new GhanaHolidayCalendar();
        this.tradingHours = new GSETradingHours();
    }

    public boolean isMarketOpen(LocalDateTime dateTime) {
        LocalDate date = dateTime.toLocalDate();
        
        if (dateTime.getDayOfWeek() == DayOfWeek.SATURDAY || dateTime.getDayOfWeek() == DayOfWeek.SUNDAY) {
            return false;
        }
        
        if (holidayCalendar.isHoliday(date)) {
            return false;
        }
        
        return tradingHours.isWithinTradingHours(dateTime) || tradingHours.isSpecialTradingSession(dateTime);
    }
}
