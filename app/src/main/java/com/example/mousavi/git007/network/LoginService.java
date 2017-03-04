package com.example.mousavi.git007.network;

import retrofit2.http.POST;
import retrofit2.http.Query;
import io.reactivex.Observable;

import com.example.mousavi.git007.models.pojo.AuthEntity;
import com.example.mousavi.git007.models.pojo.NetConstant;
import com.example.mousavi.git007.models.pojo.TokenStorer;

public interface LoginService {
    /**
     * @param client_id
     * @param client_secret
     * @param code
     */

    @POST(NetConstant.API_OAUTH2_ACCESS_TOKEN)
    Observable<AuthEntity> refreshToken(
            @Query("client_id") String client_id,
            @Query("client_secret") String client_secret,
            @Query("code") String code);

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
