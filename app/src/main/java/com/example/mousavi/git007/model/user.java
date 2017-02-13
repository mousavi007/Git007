package com.example.mousavi.git007.model;

/**
 * Created by mousavi on 2017/02/13.
 */
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;
public class user extends RealmObject {
    private String login;
    @PrimaryKey
    private Integer id;
    private String avatarUrl;
    private String url;
    private String htmlUrl;
    private String name;
    private String company;
    private Object email;
    private String bio;
    private Integer publicRepos;
    private Integer follower;
    private Integer following;
    private RealmResults<user> followers;
    private RealmResults<user> followings;
}
