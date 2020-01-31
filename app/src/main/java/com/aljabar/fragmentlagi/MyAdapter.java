package com.aljabar.fragmentlagi;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class MyAdapter extends FragmentStatePagerAdapter {

    private static ArrayList<String> myTitles;
    private static ArrayList<String> myData;

    private static int numbOfItem;

    public static MyAdapter newInstance(FragmentManager fragmentManager, ArrayList<String> titles, ArrayList<String> data){
        MyAdapter myAdapter = new MyAdapter(fragmentManager);
        myTitles = titles;
        myData = data;
        numbOfItem = data.size(); // set numbOfData as size of data or titles
        return myAdapter;
    }

    public MyAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        String text = myData.get(position);

        Fragment1 fragment1 = Fragment1.newInstance(text);

        return fragment1;
    }

    @Override
    public int getCount() {
        return numbOfItem;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = myTitles.get(position);

        return title;
    }
}
