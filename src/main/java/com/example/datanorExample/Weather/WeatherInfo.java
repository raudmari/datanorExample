package com.example.datanorExample.Weather;

public class WeatherInfo {
    private String city;
    private Double temperature;
    private Double wind_speed;
    private Double wind_direction;

    public WeatherInfo(WeatherInfoHibernate weatherInfoHibernate){
        this.city = weatherInfoHibernate.getCity();
        this.temperature = weatherInfoHibernate.getTemperature();
        this.wind_speed = weatherInfoHibernate.getWindSpeed();
        this.wind_direction = weatherInfoHibernate.getWindDirection();
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

    public Double getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(Double wind_speed) {
        this.wind_speed = wind_speed;
    }

    public Double getWind_direction() {
        return wind_direction;
    }

    public void setWind_direction(Double wind_direction) {
        this.wind_direction = wind_direction;
    }
}
