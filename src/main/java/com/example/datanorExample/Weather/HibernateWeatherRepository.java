package com.example.datanorExample.Weather;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HibernateWeatherRepository extends JpaRepository<WeatherInfoHibernate, Integer> {
}
