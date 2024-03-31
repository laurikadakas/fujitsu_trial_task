package com.example.fujitsu_trial_task.service;

import com.example.fujitsu_trial_task.model.WeatherStation;
import com.example.fujitsu_trial_task.repository.WeatherStationRepository;
import org.springframework.stereotype.Service;

@Service
public class WeatherStationService {

    private WeatherStationRepository weatherStationRepository;

    public WeatherStationService(WeatherStationRepository weatherStationRepository) {
        this.weatherStationRepository = weatherStationRepository;
    }

    public WeatherStation getWeatherStation(String stationName) {
        // TODO: Get appropriate weather station for calculations.
        return new WeatherStation();
    }
}
