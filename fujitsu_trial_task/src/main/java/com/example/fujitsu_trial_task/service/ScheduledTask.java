package com.example.fujitsu_trial_task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {

    @Autowired
    private WeatherDataReaderService weatherDataReaderService;

    @Scheduled(cron = "* 15 * * * *")
    public void execute() {
        weatherDataReaderService.saveWeatherData();
    }
}
