package com.example.coolweather.gson;


import com.google.gson.annotations.SerializedName;

/**
 * Project: CoolWeather
 * Package: com.example.coolweather.gson
 * Author: Ecko Tan
 * E-mail: ecko0804@gmail.com
 * Created at 2017/1/6:15:06
 */

public class Basic {

    @SerializedName("city")
    public String CityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }


}
