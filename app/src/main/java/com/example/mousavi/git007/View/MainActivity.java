package com.example.mousavi.git007.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mousavi.git007.pojo.User;
import com.example.mousavi.git007.model.user;
import com.example.mousavi.git007.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t1=(TextView)findViewById(R.id.t1);

    }
}
