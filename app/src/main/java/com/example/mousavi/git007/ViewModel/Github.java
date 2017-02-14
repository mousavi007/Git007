package com.example.mousavi.git007.ViewModel;

import com.example.mousavi.git007.pojo.User;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.Query;
import retrofit2.http.Path;
import retrofit2.http.GET;

public interface Github {
    @GET("users/{user}")
    Observable<User> getUserInfo(@Path("user") String user);
}
