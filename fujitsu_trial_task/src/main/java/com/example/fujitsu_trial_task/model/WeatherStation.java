package com.example.fujitsu_trial_task.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "weather_stations")
public class WeatherStation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "station_name")
    private String stationName;
    @Column(name = "wmo_code")
    private Integer wmoCode;
    @Column(name = "air_temperature")
    private double airTemperature;
    @Column(name = "wind_speed")
    private double windSpeed;
    @Column(name = "weather_phenomenon")
    private String weatherPhenomenon;
    @Column(name = "timestamp")
    private long timestamp;


}
