package com.example.coolweather.gson;


import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Project: CoolWeather
 * Package: com.example.coolweather.gson
 * Author: Ecko Tan
 * E-mail: ecko0804@gmail.com
 * Created at 2017/1/6:15:36
 */

public class Weather {

    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
