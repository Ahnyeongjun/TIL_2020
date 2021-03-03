package com.example.kakaotalk;


import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


    private ViewPager mViewPager;
    SectionPageAdapter adapter = new SectionPageAdapter(getSupportFragmentManager());


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EditText editText = (EditText)findViewById(R.id.edit);
        setContentView(R.layout.activity_main);


        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }
    public void setupViewPager(ViewPager viewPager) {
        adapter.addFragment(new Fragment_First(), "친구");
        adapter.addFragment(new Fragment_Second(), "채팅");
        adapter.addFragment(new Fragment_Third(), "검색");
        adapter.addFragment(new Fragment_Fourth(), "더보기");
        viewPager.setAdapter(adapter);
    }
}
