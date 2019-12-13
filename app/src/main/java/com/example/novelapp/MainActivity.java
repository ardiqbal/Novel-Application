package com.example.novelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    PageAdapter pageAdapter;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pageAdapter = new PageAdapter(getSupportFragmentManager(), 0);

        viewPager = findViewById(R.id.pager);

        viewPager.setAdapter(pageAdapter);
    }
}
