package com.example.datanorExample.Weather;

import java.time.LocalDateTime;

public class AllQueries {
    private String city;
    private Double temperature;
    private Double windSpeed;
    private Double windDirection;
    private LocalDateTime dateTime;

    public AllQueries(WeatherInfoHibernate weatherInfoHibernate) {
        this.city = weatherInfoHibernate.getCity();
        this.temperature = weatherInfoHibernate.getTemperature();
        this.windSpeed = weatherInfoHibernate.getWindSpeed();
        this.windDirection = weatherInfoHibernate.getWindDirection();
        this.dateTime = weatherInfoHibernate.getDateTime();

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Double getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(Double windDirection) {
        this.windDirection = windDirection;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
