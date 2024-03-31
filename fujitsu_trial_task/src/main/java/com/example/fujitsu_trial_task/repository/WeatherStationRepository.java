package com.example.fujitsu_trial_task.repository;

import com.example.fujitsu_trial_task.model.WeatherStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherStationRepository extends JpaRepository<WeatherStation, Integer> {

}
