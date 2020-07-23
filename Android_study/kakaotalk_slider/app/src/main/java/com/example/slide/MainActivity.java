package com.example.slide;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Adapter adapter;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 아까 만든 view
        viewPager = (ViewPager) findViewById(R.id.view);
        //adapter 초기화
        adapter = new Adapter(this);
        viewPager.setAdapter(adapter);
    }
}