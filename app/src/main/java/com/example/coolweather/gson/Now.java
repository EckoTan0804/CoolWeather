package com.example.coolweather.gson;


import com.google.gson.annotations.SerializedName;

/**
 * Project: CoolWeather
 * Package: com.example.coolweather.gson
 * Author: Ecko Tan
 * E-mail: ecko0804@gmail.com
 * Created at 2017/1/6:15:31
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
