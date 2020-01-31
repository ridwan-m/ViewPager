package com.aljabar.fragmentlagi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;    //Membuat objek ViewPager
    private MyAdapter myAdapter;
    private TabLayout tabMenu;

    ArrayList<String> menuTitleData = new ArrayList<>();
    ArrayList<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateTitle();
        generateData();

        viewPager = findViewById(R.id.vp_pager);
        tabMenu = findViewById(R.id.tab_menu);
       // myAdapter = new MyAdapter(getSupportFragmentManager());
        myAdapter = MyAdapter.newInstance(getSupportFragmentManager(), menuTitleData, data);
        tabMenu.setupWithViewPager(viewPager);
        viewPager.setAdapter(myAdapter);
    }
    //Membuat dummy title data
    private void generateTitle(){
        menuTitleData.add("Home");
        menuTitleData.add("Photos");
        menuTitleData.add("Message");
        menuTitleData.add("Sign");
    }

    private void generateData(){
        data.add("Data 1");
        data.add("Data 2");
        data.add("Data 3");
        data.add("Data 4");
    }
}
