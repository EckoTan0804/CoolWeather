package com.example.coolweather.util;


import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * This class aims to communicate with server.
 *
 * Project: CoolWeather
 * Package: com.example.coolweather.util
 * Author: Ecko Tan
 * E-mail: ecko0804@gmail.com
 * Created at 2017/1/6:08:54
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }
}
