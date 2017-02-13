package com.example.mousavi.git007.ViewModel;

import com.example.mousavi.git007.model.user;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.Query;
import retrofit2.http.Path;
import retrofit2.http.GET;

public interface Github {
    @GET("users/{user}")
    Observable<user> getUserInfo(@Path("user") String user);
}
