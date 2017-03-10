package com.example.sam.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sam on 2017/3/10.
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
