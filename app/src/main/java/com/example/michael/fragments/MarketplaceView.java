package com.example.michael.fragments;

import android.support.v4.app.Fragment;
import android.util.Log;
import android.widget.Toast;

import com.example.michael.fragments.Interfaces.FragmentChangeListener;
import com.example.michael.fragments.Interfaces.MarketplaceInterfaceView;

public class MarketplaceView extends MainActivity  implements MarketplaceInterfaceView {
    private static String TAG ="MarketplaceView";
    @Override
    public void showOfferSucessfulToast() {

    }

    @Override
    public void startLogoutActivity() {

    }

    public void showCreateOfferView(){
        Log.d(TAG, "showCreateOfferView: startet");
        Fragment cof=new CreateOfferFragment();
        MarketplaceHomeFragment mhf= new MarketplaceHomeFragment();
        mhf.showOtherFragment(cof);





    }
    public void showFavoritesView(){
        Log.d(TAG, "showFavoritesView: started");

    }
}
