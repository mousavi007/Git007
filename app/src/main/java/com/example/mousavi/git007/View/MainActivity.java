package com.example.mousavi.git007.View;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.example.mousavi.git007.R;
import com.example.mousavi.git007.models.pojo.TokenStorer;
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
        TokenStorer t1=new TokenStorer();
        webview.setWebViewClient(new WebViewClient() {

            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                String accessTokenFragment = "access_token=";
                String accessCodeFragment = "code=";
                // We hijack the GET request to extract the OAuth parameters

                if (url.contains(accessTokenFragment)) {
                    // the GET request contains directly the token
                    String accessToken = url.substring(url.indexOf(accessTokenFragment));
                    t1.setAccessToken(accessToken);
                    t.setText(t1.getAccessToken());

                } else if(url.contains(accessCodeFragment)) {
                    // the GET request contains an authorization code
                    String accessCode = url.substring(url.indexOf(accessCodeFragment)+5);
                    t1.setAccessCode(accessCode);
                    Intent i=new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(i);

                   // String query = "client_id=" + CLIENT_ID + "&client_secret=" + CLIENT_SECRET + "&code=" + accessCode;
                  //  view.postUrl(OAUTH_ACCESS_TOKEN_URL, query.getBytes());

                }

            }



        });
        webview.loadUrl(url);
        t.setText(t1.getAccessToken());
int y =90;

    }
}
