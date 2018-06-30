package com.example.michael.fragments;

//import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.michael.fragments.Interfaces.FragmentChangeListener;

public class MainActivity extends AppCompatActivity implements FragmentChangeListener {
    private static final String TAG = "MainActivity";
    private FragmentManager manager;

    private SectionsStatePagerAdapter sectionsStatePagerAdapter;
    private ViewPager viewPager; //view Object referenz

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started");
        MarketplaceHomeFragment homeFragment = new MarketplaceHomeFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, homeFragment).commit();
    }


    @Override
    public void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.addToBackStack(fragment.toString());
        fragmentTransaction.commit();

    }
}
        /*
        //a sectionsStatePagerAdapter = new SectionsStatePagerAdapter(getSupportFragmentManager());
        //a FragmentManager fm = getFragmentManager();
        //container referenzieren, also der viewPager, darin werden die fragments getauscht!

        viewPager = (ViewPager) findViewById(R.id.container);
        //setup the pager
        setupViewPager(viewPager);
    }
    private void setupViewPager(ViewPager viewPager){
        SectionsStatePagerAdapter adapter = new SectionsStatePagerAdapter(getSupportFragmentManager());


        //in wirklicher app name = der screen mit dem man arbeitet
        //die reihenfolge ist oberstes fragment zuerst -> fragment 1
        adapter.addFragment(new MarketplaceHomeFragment(), "MarketplaceHomeFragment");
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

        */