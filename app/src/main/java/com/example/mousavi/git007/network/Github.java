package com.example.mousavi.git007.network;

import com.example.mousavi.git007.models.pojo.User;

import io.reactivex.Observable;
import retrofit2.http.Path;
import retrofit2.http.GET;

public interface Github {
    @GET("users/{user}")
    Observable<User> getUserInfo(@Path("user") String user);
}
