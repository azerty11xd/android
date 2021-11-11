package com.example.pandroid.childrenFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pandroid.R;
import com.example.pandroid.listAdapter;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Ch2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Ch2Fragment extends Fragment {





    public Ch2Fragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_ch3, container, false);
        View view=inflater.inflate(R.layout.fragment_ch2, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.weekRecycleView);
        listAdapter listAdapter = new listAdapter() ;
        recyclerView.setAdapter(listAdapter);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        return view;
    }
}