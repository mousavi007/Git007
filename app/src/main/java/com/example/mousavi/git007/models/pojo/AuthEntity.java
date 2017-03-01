package com.example.mousavi.git007.models.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AuthEntity {
    @SerializedName("access_token")
    @Expose
    private String access_token;
    @SerializedName("expires_in")
    @Expose
    private String expires_in;
    @SerializedName("refresh_token")
    @Expose
    private String refresh_token;
    @SerializedName("sessionID")
    @Expose
    private String sessionID;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }
}
