package com.example.michael.fragments;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private SectionsStatePagerAdapter mSectionsStatePagerAdapter;
    private ViewPager mViewPager; //view Object referenz

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started");


        mSectionsStatePagerAdapter = new SectionsStatePagerAdapter(getSupportFragmentManager());
        //container referenzieren, also der viewPager, darin werden die fragments getauscht!

        mViewPager = (ViewPager) findViewById(R.id.container);
        //setup the pager
        setupViewPager(mViewPager);
    }
    private void setupViewPager(ViewPager viewPager){
        SectionsStatePagerAdapter adapter = new SectionsStatePagerAdapter(getSupportFragmentManager());


        //in wirklicher app name = der screen mit dem man arbeitet
        //die reihenfolge ist oberstes fragment zuerst -> fragment 1
        adapter.addFragment(new Fragment1(), "Fragment1");
        adapter.addFragment(new Fragment2(), "Fragment2");
        adapter.addFragment(new Fragment3(), "Fragment3");
        viewPager.setAdapter(adapter);
    }
    //muss von fragment1 erreichbar sein
    public void setmViewPager(int fragmentNumber){
        mViewPager.setCurrentItem(fragmentNumber);
    }
}
