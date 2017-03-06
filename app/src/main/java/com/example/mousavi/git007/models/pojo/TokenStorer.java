package com.example.mousavi.git007.models.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mousavi on 2017/03/04.
 */

public class TokenStorer {
    @SerializedName("access_token")
    @Expose
    private static String accessToken;

    @SerializedName("accessCode")
    @Expose
    private static String accessCode;

    public static String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public static String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

}
