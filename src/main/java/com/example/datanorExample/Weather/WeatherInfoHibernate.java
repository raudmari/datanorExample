package com.example.datanorExample.Weather;

import javax.persistence.*;

@Entity
@Table (name="weather_queries")
public class WeatherInfoHibernate {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private String city;
    private Double temperature;
    private Double windSpeed;
    private Double windDirection;

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
}
