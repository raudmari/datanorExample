package com.example.datanorExample.Weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeatherController {

    //private String appKey = "a8775018b559279894847e4fe88bcd30";

    @Autowired WeatherService weatherService;

    // http:localhost:8585/marionilm

    @GetMapping("marionilm")
    public WeatherInfo getWeatherByCity(@RequestParam("q") String city){
        return weatherService.getWeatherByCity(city);
    }

    @DeleteMapping("marionilm/delete")
    public void deleteWeatherInfo() {
        weatherService.deleteWeatherInfo();
    }

    @GetMapping("marionilm/showAll")
    public List<AllQueries> getAllQueries () { return weatherService.getAllQueries(); }


}
