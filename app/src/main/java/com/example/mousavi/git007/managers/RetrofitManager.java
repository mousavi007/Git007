package com.example.mousavi.git007.managers;

import com.example.mousavi.git007.network.Github;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitManager {
    private static final String BASE_URL = "http://api.themoviedb.org/3/";
    public static final String IMAGE_URL = "http://image.tmdb.org/t/p/w500/";
    private static RetrofitManager instance = null;
    private  Github service;

    /**
     * Constructor used to build MovieDB service.
     */
    private RetrofitManager() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        service = retrofit.create(Github.class);
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
    public Github getService() {
        return service;
    }
}
