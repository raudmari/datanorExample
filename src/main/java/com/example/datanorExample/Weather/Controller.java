package com.example.datanorExample.Weather;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @GetMapping("api.openweathermap.org/data/2.5/weather?q={city}&units=metric&appid={API key}")
    public List<WeatherInfo> getWeatherbyCity(@RequestParam("q") String city,@RequestParam("appid") String apiKey, @RequestParam("units") String inMetric) {
        return weatherService.getWeatherInfo();
    }
}
