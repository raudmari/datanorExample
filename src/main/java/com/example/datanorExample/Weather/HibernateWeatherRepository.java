package com.example.datanorExample.Weather;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HibernateWeatherRepository extends JpaRepository<WeatherInfoHibernate, Integer> {
    List<WeatherInfoHibernate> findAllBy();

}
