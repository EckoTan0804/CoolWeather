package com.example.coolweather.gson;


/**
 * Project: CoolWeather
 * Package: com.example.coolweather.gson
 * Author: Ecko Tan
 * E-mail: ecko0804@gmail.com
 * Created at 2017/1/6:15:30
 */

public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;

        public String pm25;
    }
}
