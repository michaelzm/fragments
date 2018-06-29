package com.example.michael.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private SectionsStatePagerAdapter sectionsStatePagerAdapter;
    private ViewPager viewPager; //view Object referenz

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started");


        sectionsStatePagerAdapter = new SectionsStatePagerAdapter(getSupportFragmentManager());
        FragmentManager fm = getFragmentManager();
        //container referenzieren, also der viewPager, darin werden die fragments getauscht!

        viewPager = (ViewPager) findViewById(R.id.container);
        //setup the pager
        setupViewPager(viewPager);
    }
    private void setupViewPager(ViewPager viewPager){
        SectionsStatePagerAdapter adapter = new SectionsStatePagerAdapter(getSupportFragmentManager());


        //in wirklicher app name = der screen mit dem man arbeitet
        //die reihenfolge ist oberstes fragment zuerst -> fragment 1
        adapter.addFragment(new MarketplaceHome(), "MarketplaceHome");
        adapter.addFragment(new CreateOfferFragment(), "CreateOfferFragment");
        adapter.addFragment(new SearchOffer(), "SearchOffer");
        viewPager.setAdapter(adapter);
    }
    //muss von fragment1 erreichbar sein
    public void setViewPager(int fragmentNumber){
        viewPager.setCurrentItem(fragmentNumber);
    }

    @Override
    public void onBackPressed() {
        setViewPager(0);
    }

}
