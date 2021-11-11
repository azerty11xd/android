package com.example.pandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.pandroid.parentsFragment.P1Fragment;
import com.example.pandroid.parentsFragment.P2Fragment;
import com.example.pandroid.parentsFragment.P3Fragment;

import java.util.Locale;

import nl.joery.animatedbottombar.AnimatedBottomBar;

public class MainActivity extends AppCompatActivity {


    AnimatedBottomBar tabLayout;
    ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addfragment();




    }

    private void addfragment() {
        tabLayout=findViewById(R.id.mainbar);
        viewPager=findViewById(R.id.viewpager);
        viewPageAdapte adapter = new  viewPageAdapte(getSupportFragmentManager()) ;
        adapter.addFragment(new P1Fragment(),"p1");
        adapter.addFragment(new P2Fragment(),"p2");
        adapter.addFragment(new P3Fragment(),"p3");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }



}
/*
private static final String TAG= MainActivity.class.getSimpleName();
    AnimatedBottomBar mainanimatedBottomBar,animatedBottomBar ;
    FragmentManager fragmentManager ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       animatedBottomBar= findViewById(R.id.bar);
        mainanimatedBottomBar= findViewById(R.id.mainbar);




        if(savedInstanceState==null){

            mainanimatedBottomBar.selectTabById(R.id.home,true);
            fragmentManager=getSupportFragmentManager();
            homeFragment homeFragment = new homeFragment();
            fragmentManager.beginTransaction().replace(R.id.fragment_Container,homeFragment).commit();


        }











        mainanimatedBottomBar.setOnTabSelectListener(new AnimatedBottomBar.OnTabSelectListener() {
            @Override
            public void onTabSelected(int lastIndex, @Nullable AnimatedBottomBar.Tab lastIab, int newIndex, @NonNull AnimatedBottomBar.Tab newTab) {

                Fragment fragment = null;
                int mainfragOldIndex=lastIndex;
                int mainfragNewIndex=newIndex;

                Log.e("mainnewtab","mainnewTab.getId"+newTab.getId());

                switch(newTab.getId()){
                    case R.id.history:

                        fragment = new historyFragment();

                        break;
                    case R.id.home:

                        fragment = new homeFragment();
                        break;
                    case  R.id.profile:

                        fragment = new profileFragment();
                        break;

                }
                if (fragment!=null){
                    if(mainfragNewIndex==0){
                        animatedBottomBar.setVisibility(View.VISIBLE);
                    }else{
                        animatedBottomBar.setVisibility(View.INVISIBLE);
                    }
                    switch (mainfragOldIndex){

                        case 0:

                            fragmentManager.beginTransaction().setCustomAnimations(    R.anim.left2right,  // enter
                                    R.anim.left2rightexit


                                    // exit

                            ).
                                    replace(R.id.fragment_Container,fragment).commit() ;

                            break;

                        case 2:

                            fragmentManager.beginTransaction().setCustomAnimations(   R.anim.right2left,  // enter
                                    R.anim.right2leftexit  // exit

                            ).
                                    replace(R.id.fragment_Container,fragment).commit() ;
                            break;
                        case 1:
                            if(mainfragNewIndex==0){

                                fragmentManager.beginTransaction().setCustomAnimations(    R.anim.right2left,  // enter
                                        R.anim.right2leftexit // exit

                                ).
                                        replace(R.id.fragment_Container,fragment).commit() ;

                            }else{

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










        animatedBottomBar.setOnTabSelectListener(new AnimatedBottomBar.OnTabSelectListener() {
            @Override
            public void onTabSelected(int lastIndex, @Nullable AnimatedBottomBar.Tab lastIab, int newIndex, @NonNull AnimatedBottomBar.Tab newTab) {

                Fragment fragment = null;
                int mainfragOldIndex=lastIndex;
                int mainfragNewIndex=newIndex;
                Log.e("newtab","newTab.getId"+newTab.getId());


                switch(newTab.getId()){
                    case R.id.day:

                        fragment = new historyFragment();

                        break;
                    case R.id.week:

                        fragment = new homeFragment();
                        break;
                    case  R.id.month:

                        fragment = new profileFragment();
                        break;

                }
                Log.e("newtab"," fragment"+ fragment);
                if (fragment!=null){

                    switch (mainfragOldIndex){

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
                            if(mainfragNewIndex==0){
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
                    Log.e(TAG,"error");
                }
            }

            @Override
            public void onTabReselected(int i, @NonNull AnimatedBottomBar.Tab tab) {

            }
        });



/*
if(savedInstanceState==null){
    Log.e("testanim","obba");
    animatedBottomBar.selectTabById(R.id.day,true);
    fragmentManager=getSupportFragmentManager();
    DayFragment dayFragment = new DayFragment();
    fragmentManager.beginTransaction().replace(R.id.fragment_Container,dayFragment).commit();


}
*/

/*

  animatedBottomBar.setOnTabSelectListener(new AnimatedBottomBar.OnTabSelectListener() {
      @Override
      public void onTabSelected(int lastIndex, @Nullable AnimatedBottomBar.Tab lastIab, int newIndex, @NonNull AnimatedBottomBar.Tab newTab) {

          Fragment fragment = null;

          fragOldIndex = lastIndex;
          fragNewIndex =newIndex;



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
              Log.e(TAG,"error");
          }
      }

      @Override
      public void onTabReselected(int i, @NonNull AnimatedBottomBar.Tab tab) {

      }
  });
*/

