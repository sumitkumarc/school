package com.skyzone18.ParasharVidyaSankul.Rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;

/**
 * Created by sumit on 2/2/2018.
 */

public class RetroClient {
    public static final String BASE_URL = "http://mpanel.parasharvidyasankul.com/";
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit==null) {

            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(MyJsonConverter.create(gson))
                    .build();
        }
        return retrofit;
    }
}
