package com.example.datanorExample.Weather;

import com.example.datanorExample.exceptions.ApplicationException;
import com.example.datanorExample.exceptions.ErrorResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import liquibase.pro.packaged.W;
import org.hibernate.bytecode.internal.bytebuddy.BytecodeProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {

    @Autowired
    HibernateWeatherRepository hibernateWeatherRepository;

    @Autowired
    private RestTemplate restTemplate;

    public WeatherInfo getWeatherByCity(String city) {
        ResponseEntity<WeatherInfoResponse> responseEntity = restTemplate.getForEntity
                ("http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=a8775018b559279894847e4fe88bcd30" + "&units=metric", WeatherInfoResponse.class);
        if (true) {
            WeatherInfoResponse body = responseEntity.getBody();
            body.getMain().getTemp();
            body.getWind().getDeg();
            body.getWind().getSpeed();
            WeatherInfoHibernate weatherInfoHibernate = new WeatherInfoHibernate();
            weatherInfoHibernate.setCity(city);
            weatherInfoHibernate.setTemperature(body.getMain().getTemp());
            weatherInfoHibernate.setWindSpeed(body.getWind().getSpeed());
            weatherInfoHibernate.setWindDirection(body.getWind().getDeg());
            weatherInfoHibernate.setDateTime(LocalDateTime.now());
            hibernateWeatherRepository.save(weatherInfoHibernate);
            WeatherInfo weatherInfo = new WeatherInfo(weatherInfoHibernate);
            return weatherInfo;
        } else {
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }
    }

    public void deleteWeatherInfo() {
        hibernateWeatherRepository.deleteAll();
    }

    public List<AllQueries> getAllQueries() {
        List<WeatherInfoHibernate> weatherInfoHibernates = hibernateWeatherRepository.findAll();
        List<AllQueries> allQueries = new ArrayList<>();
        for (WeatherInfoHibernate weatherInfoHibernate : weatherInfoHibernates) {
            allQueries.add(new AllQueries(weatherInfoHibernate));
        }
        return allQueries;
    }

}





