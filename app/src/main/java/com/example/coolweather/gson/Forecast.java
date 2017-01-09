package com.example.coolweather.gson;


import com.google.gson.annotations.SerializedName;

/**
 * Project: CoolWeather
 * Package: com.example.coolweather.gson
 * Author: Ecko Tan
 * E-mail: ecko0804@gmail.com
 * Created at 2017/1/6:15:34
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {

        @SerializedName("txt_d")
        public String info;
    }
}
