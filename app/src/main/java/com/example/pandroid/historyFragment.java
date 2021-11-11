package com.example.pandroid;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import nl.joery.animatedbottombar.AnimatedBottomBar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link historyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class historyFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public historyFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment historyFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static historyFragment newInstance(String param1, String param2) {
        historyFragment fragment = new historyFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

/*
    AnimatedBottomBar animatedBottomBar ;
    FragmentManager fragmentManager ;
*/

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


      //  LinearLayout test2 =(LinearLayout )inflater.inflate(R.layout.fragment_day,null);
    //    animatedBottomBar=test2.findViewById(R.id.bar);
        /*
        if(savedInstanceState==null){

            animatedBottomBar.selectTabById(R.id.profile,true);
            fragmentManager=getActivity().getSupportFragmentManager();
            DayFragment dayFragment = new DayFragment();
            fragmentManager.beginTransaction().replace(R.id.fragment_Container,dayFragment).commit();





        }
        animatedBottomBar.setOnTabSelectListener(new AnimatedBottomBar.OnTabSelectListener() {
            @Override
            public void onTabSelected(int lastIndex, @Nullable AnimatedBottomBar.Tab lastIab, int newIndex, @NonNull AnimatedBottomBar.Tab newTab) {

                Fragment fragment = null;

                int fragOldIndex = lastIndex;
                int fragNewIndex =newIndex;



                switch(newTab.getId()){
                    case R.id.day:

                        fragment = new DayFragment();

                        break;
                    case R.id.week:

                        fragment = new WeekFragment();
                        break;
                    case  R.id.month:

                        fragment = new YearFragment();
                        break;

                }
                if (fragment!=null){
                    switch (fragOldIndex){

                        case 0:
                            Log.e("testanim","0to1");
                            fragmentManager.beginTransaction().setCustomAnimations(    R.anim.left2right,  // enter
                                    R.anim.left2rightexit


                                    // exit

                            ).
                                    replace(R.id.fragment_Container,fragment).commit() ;
                            break;

                        case 2:
                            Log.e("testanim","2to1");
                            fragmentManager.beginTransaction().setCustomAnimations(   R.anim.right2left,  // enter
                                    R.anim.right2leftexit  // exit

                            ).
                                    replace(R.id.fragment_Container,fragment).commit() ;
                            break;
                        case 1:
                            if(fragNewIndex==0){
                                Log.e("testanim","1to0");
                                fragmentManager.beginTransaction().setCustomAnimations(    R.anim.right2left,  // enter
                                        R.anim.right2leftexit // exit

                                ).
                                        replace(R.id.fragment_Container,fragment).commit() ;
                            }else{
                                Log.e("testanim","1to2");
                                fragmentManager.beginTransaction().setCustomAnimations(   R.anim.left2right,  // enter
                                        R.anim.left2rightexit  // exit

                                ).
                                        replace(R.id.fragment_Container,fragment).commit() ;
                            }
                            break;
                    }


                }else{

                }
            }

            @Override
            public void onTabReselected(int i, @NonNull AnimatedBottomBar.Tab tab) {

            }
        });
*/
        return inflater.inflate(R.layout.fragment_history, container, false);
    }

}