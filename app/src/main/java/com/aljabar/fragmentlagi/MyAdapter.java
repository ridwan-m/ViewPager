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
        data = data;
        numbOfItem = data.size(); // set numbOfData as size of data or titles
        return myAdapter;
    }

    public MyAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment1 fragment1 = new Fragment1();
        Fragment2 fragment2 = new Fragment2();

        Fragment item = null;

        switch (position){
            case 0:
            item = fragment1;
            break;
            case 1:
            item = fragment2;
            break;
            default:
                item = fragment2;
                break;
        }

        return item;
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
