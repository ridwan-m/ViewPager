package com.aljabar.fragmentlagi;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

    public static Fragment1 newInstance(String text){
        Fragment1 fragment1 = new Fragment1();
        Bundle args = new Bundle();
        args.putString("text", text);
        fragment1.setArguments(args);
        return fragment1;
    }


    public Fragment1() {
        // Required empty public constructor
    }

    private TextView textData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View rootView = inflater.inflate(R.layout.fragment1, container, false);
         textData = rootView.findViewById(R.id.tv_data);
         textData.setText(getArguments().getString("text"));
        return rootView;
    }

}
