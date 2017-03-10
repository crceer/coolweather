package com.example.sam.coolweather.gson;

/**
 * Created by sam on 2017/3/10.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
