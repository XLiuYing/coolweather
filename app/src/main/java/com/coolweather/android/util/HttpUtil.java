package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();//创建实例
        Request request = new Request.Builder().url(address).build();//发http前创建对象，在build()前连缀其他方法丰富request，URL设置地址
        client.newCall(request).enqueue(callback);//enqueue()内部开好子线程子线程执行，请求结果回调到callback
    }
}
