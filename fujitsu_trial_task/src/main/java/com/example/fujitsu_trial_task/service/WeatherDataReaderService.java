package com.example.fujitsu_trial_task.service;

import com.example.fujitsu_trial_task.repository.WeatherStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherDataReaderService {

    // This service is used in ScheduledTask for the CronJob to save new weather data to the database.

    private String weatherDataPath = "https://www.ilmateenistus.ee/ilma_andmed/xml/observations.php";
    @Autowired
    private WeatherStationRepository weatherStationRepository;

    public void saveWeatherData() {

        // TODO: implement functionality that parses XML data from weatherDataPath and saves it to database. I would
        //  follow this link trying to implement this: https://stackoverflow.com/questions/38904352/parsing-xml-from-url-in-java
        //  This method ideally would also filter out other weather stations so database would only have records for
        //  needed weather stations. To implement that, the method could take in a list of strings as arguments.
        //  Further improvement on this method would be creating the list of strings - maybe an enumeration - elsewhere
        //  in perhaps a new package, so if new stations needed to be considered this method would not need to be updated.
    }
}
