package com.example.pandroid.parentsFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pandroid.R;
import com.example.pandroid.childrenFragment.Ch1Fragment;
import com.example.pandroid.childrenFragment.Ch2Fragment;
import com.example.pandroid.childrenFragment.Ch3Fragment;
import com.example.pandroid.viewPageAdapte;

import nl.joery.animatedbottombar.AnimatedBottomBar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link P1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class P1Fragment extends Fragment {

    AnimatedBottomBar tabLayout;
    ViewPager viewPager;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public P1Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment P1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static P1Fragment newInstance(String param1, String param2) {
        P1Fragment fragment = new P1Fragment();
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
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_p1, container, false);
        addFragment(view);
        return view;
    }
    private  void addFragment(View view){
        tabLayout=view.findViewById(R.id.mainbar2);
        viewPager=view.findViewById(R.id.viewpager2);
        viewPageAdapte adapter = new  viewPageAdapte(getChildFragmentManager()) ;
        adapter.addFragment(new Ch1Fragment(),"ch1");
        adapter.addFragment(new Ch2Fragment(),"ch2");
        adapter.addFragment(new Ch3Fragment(),"ch2");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}