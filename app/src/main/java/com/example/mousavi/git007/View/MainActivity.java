package com.example.mousavi.git007.View;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.*;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.example.mousavi.git007.managers.RetrofitManager;
import com.example.mousavi.git007.models.pojo.AuthEntity;
import com.example.mousavi.git007.models.pojo.NetConstant;
import com.example.mousavi.git007.models.pojo.TokenStorer;
import com.example.mousavi.git007.network.Github;
import com.example.mousavi.git007.models.pojo.User;
import com.example.mousavi.git007.R;
import com.example.mousavi.git007.network.LoginService;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
public class MainActivity extends AppCompatActivity {

    public static String OAUTH_URL = "https://github.com/login/oauth/authorize";
    public static String OAUTH_ACCESS_TOKEN_URL = "https://github.com/login/oauth/access_token";

    public static String CLIENT_ID = "5bf29364071543db722d";
    public static String CLIENT_SECRET = "92201c29b73d7a183286f6b7ad0c0b08760b1c02";
    public static String CALLBACK_URL = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String url = OAUTH_URL + "?client_id=" + CLIENT_ID;

        WebView webview = (WebView)findViewById(R.id.webview01);
        webview.getSettings().setJavaScriptEnabled(true);
        final TextView t=(TextView)findViewById(R.id.textView);
        final TokenStorer t1=new TokenStorer();
        webview.setWebViewClient(new WebViewClient() {
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                String accessTokenFragment = "access_token=";
                String accessCodeFragment = "code=";

                // We hijack the GET request to extract the OAuth parameters

                if (url.contains(accessTokenFragment)) {
                    // the GET request contains directly the token
                    String accessToken = url.substring(url.indexOf(accessTokenFragment));
                    t1.setAccessToken(accessToken);

                } else if(url.contains(accessCodeFragment)) {
                    // the GET request contains an authorization code
                    String accessCode = url.substring(url.indexOf(accessCodeFragment)+5);
                    t1.setAccessCode(accessCode);


                //    String query = "client_id=" + CLIENT_ID + "&client_secret=" + CLIENT_SECRET + "&code=" + accessCode;
                //    view.postUrl(OAUTH_ACCESS_TOKEN_URL, query.getBytes());

                }

            }



        });
        webview.loadUrl(url);
RetrofitManager r1;
        r1=RetrofitManager.newInstance();
        Observable<AuthEntity> observable=r1.getService().refreshToken(CLIENT_ID,CLIENT_SECRET,t1.getAccessCode());
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(x->{
                    t.setText(x.getAccess_token());});

        int y =90;

    }
}
