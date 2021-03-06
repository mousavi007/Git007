package com.example.mousavi.git007.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.mousavi.git007.R;
import com.example.mousavi.git007.managers.RetrofitManager;
import com.example.mousavi.git007.models.pojo.AccessToken;
import com.example.mousavi.git007.models.pojo.TokenStorer;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class Main2Activity extends AppCompatActivity {

    public static String OAUTH_URL = "https://github.com/login/oauth/authorize";
    public static String OAUTH_ACCESS_TOKEN_URL = "https://github.com/login/oauth/access_token";

    public static String CLIENT_ID = "5bf29364071543db722d";
    public static String CLIENT_SECRET = "92201c29b73d7a183286f6b7ad0c0b08760b1c02";
    public static String CALLBACK_URL = "";
    TokenStorer t1=new TokenStorer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String s=t1.getAccessCode();
        TextView t=(TextView)findViewById(R.id.textView2);
        Observable<AccessToken> observable= RetrofitManager.newInstance().getService().refreshToken(CLIENT_ID,CLIENT_SECRET,s);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(x->{t.setText(x.getAccessToken());
                Intent intent=new Intent(Main2Activity.this,Main3Activity.class);});

    }
}
