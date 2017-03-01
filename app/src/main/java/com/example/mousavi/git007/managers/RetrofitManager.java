package com.example.mousavi.git007.managers;

import com.example.mousavi.git007.network.Github;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import com.example.mousavi.git007.network.LoginService;

public class RetrofitManager {
    private static final String BASE_URL = "https://api.github.com";
    private static RetrofitManager instance = null;
    private  LoginService service;

    /**
     * Constructor used to build MovieDB service.
     */
    private RetrofitManager() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        service = retrofit.create(LoginService.class);
    }

    /**
     * Method with Singleton pattern to instantiate only one time the MovieDB service.
     * @return realm {@link RetrofitManager}
     */
    public static RetrofitManager newInstance() {
        if (instance == null) {
            instance = new RetrofitManager();
        }
        return instance;
    }

    /**
     * Getter for Movie DB service
     * @return service {@link Github}
     */
    public LoginService getService() {
        return service;
    }
}
