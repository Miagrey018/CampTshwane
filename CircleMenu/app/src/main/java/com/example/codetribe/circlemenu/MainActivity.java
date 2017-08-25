package com.example.codetribe.circlemenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hitomi.cmlibrary.CircleMenu;

public class MainActivity extends AppCompatActivity {
    private CircleMenu onDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
    }

    private void initView(){
        onDemo = (CircleMenu)findViewById(R.id.demo);

    }
}
