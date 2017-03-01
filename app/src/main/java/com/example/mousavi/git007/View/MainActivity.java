package com.example.mousavi.git007.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.example.mousavi.git007.managers.RetrofitManager;
import com.example.mousavi.git007.models.pojo.AuthEntity;
import com.example.mousavi.git007.models.pojo.NetConstant;
import com.example.mousavi.git007.network.Github;
import com.example.mousavi.git007.models.pojo.User;
import com.example.mousavi.git007.R;
import com.example.mousavi.git007.network.LoginService;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText e1=(EditText)findViewById(R.id.editText);
        EditText e2=(EditText)findViewById(R.id.editText2);
        TextView t3=(TextView)findViewById(R.id.t3);
        Button b1=(Button)findViewById(R.id.button);
        String user= e1.getText().toString();
        String pass= e2.getText().toString();
       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Observable<AuthEntity> observable= RetrofitManager.newInstance().getService()
                       .login(NetConstant.MD_APP_KEY,NetConstant.MD_APP_SECRET, LoginService.GrantType.PASSWORD,user,pass);
               observable.subscribeOn(Schedulers.io())
                       .observeOn(AndroidSchedulers.mainThread()).subscribe((x)->{t3.setText(x.getExpires_in());});
           }
       });


    }
}
