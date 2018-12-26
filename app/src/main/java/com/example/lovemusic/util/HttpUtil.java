package com.example.lovemusic.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {

    public static String requestBingPic = "http://guolin.tech/api/bing_pic"; //必应每日一图接口

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
