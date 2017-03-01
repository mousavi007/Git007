package com.example.mousavi.git007.network;

import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

import com.example.mousavi.git007.models.pojo.AuthEntity;
import com.example.mousavi.git007.models.pojo.NetConstant;

public interface LoginService {
    /**
     * @param app_key
     * @param app_secret
     * @param grant_type
     * @param refresh_token
     */

    @POST(NetConstant.API_OAUTH2_ACCESS_TOKEN)
    Observable<AuthEntity> refreshToken(
            @Query("app_key") String app_key,
            @Query("app_secret") String app_secret,
            @Query("grant_type") String grant_type,
            @Query("refresh_token") String refresh_token);

    /**
     * @param username
     * @param password
     */
    @POST(NetConstant.API_OAUTH2_ACCESS_TOKEN)
    Observable<AuthEntity> login(
            @Query("app_key") String app_key,
            @Query("app_secret") String app_secret,
            @Query("grant_type") String grant_type,
            @Query("username") String username,
            @Query("password") String password);

    class GrantType {
        public static final String PASSWORD = "password";
        public static final String REFRESH_TOKEN = "refresh_token";
    }
}
