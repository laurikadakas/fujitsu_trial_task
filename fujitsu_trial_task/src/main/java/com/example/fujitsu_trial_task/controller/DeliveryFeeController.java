package com.example.fujitsu_trial_task.controller;

import com.example.fujitsu_trial_task.service.WeatherStationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliveryFeeController {

    /* This controller would handle the incoming requests and calculate the delivery fees, using WeatherStationService
        to obtain weather data for calculating the extra fees.
     */


    private WeatherStationService weatherStationService;

    public double calculateDeliveryFee(String city, String vehicle) {
        // TODO: Implement the calculation as shown in instruction. This would use weatherStationService to get weather
        //  data needed for the extra fees.
        return 0.0;
    }

    // TODO: Implement handling GET requests to calculate the delivery fee. There would likely be multiple methods
    @GetMapping("/{city}/{vehicle}")
    public ResponseEntity<Double> getDeliveryFee(@PathVariable String city, @PathVariable String vehicle) {
        double totalFee = calculateDeliveryFee(city, vehicle);
        return new ResponseEntity<>(totalFee, HttpStatus.OK);
    }


}
