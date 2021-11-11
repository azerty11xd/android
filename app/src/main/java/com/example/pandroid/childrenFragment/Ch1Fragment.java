package com.example.pandroid.childrenFragment;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pandroid.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import app.futured.donut.DonutProgressView;
import app.futured.donut.DonutSection;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Ch1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Ch1Fragment extends Fragment {

    private DonutProgressView  dpvChart;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Ch1Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Ch1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Ch1Fragment newInstance(String param1, String param2) {
        Ch1Fragment fragment = new Ch1Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view=inflater.inflate(R.layout.fragment_ch1, container, false);
        DonutProgressView dpvChart=  view.findViewById(R.id.donut_view);
        DonutSection section1 = new DonutSection("Section 1 Name", Color.parseColor("#7F58af"), 25.0f);
        DonutSection section2 = new DonutSection("Section 2 Name", Color.parseColor("#64c5eb"), 20.0f);
        DonutSection section3= new DonutSection("Section 3 Name", Color.parseColor("#e84d8a"), 10.0f);
        DonutSection section4= new DonutSection("Section 3 Name", Color.parseColor("#feb326"), 10.0f);
        dpvChart.setCap(100f);
        List< DonutSection> list = new ArrayList< DonutSection>();
        list.add(section1);
        list.add(section2);
        list.add(section3);
        dpvChart.submitData(list);
        return view;

        // Inflate the layout for this fragment
      //  return inflater.inflate(R.layout.fragment_ch1, container, false);
    }
}