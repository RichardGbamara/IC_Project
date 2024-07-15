package com.example.service;

import com.example.model.Holiday;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GhanaHolidayCalendar {
    private List<Holiday> holidays;

    public GhanaHolidayCalendar() {
        holidays = new ArrayList<>();
        initializeHolidays();
    }

    private void initializeHolidays() {
        // Add holidays here (example for 2024)
        holidays.add(new Holiday("New Year's Day", LocalDate.of(2024, 1, 1)));
        holidays.add(new Holiday("Independence Day", LocalDate.of(2024, 3, 6)));
        // Add more holidays as needed
    }

    public boolean isHoliday(LocalDate date) {
        return holidays.stream().anyMatch(holiday -> holiday.getDate().equals(date));
    }
}
