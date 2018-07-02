package com.example.michael.fragments;

import android.support.v4.app.Fragment;
import android.util.Log;

import com.example.michael.fragments.Interfaces.MarketplaceInterfaceView;

public class MarketplaceView extends MP_MainActivity implements MarketplaceInterfaceView {
    //view komplett unnötig von der programmierung her, ich lass es trotzdem mal drin


    private static String TAG ="MarketplaceView";

    public MarketplaceView() {
    }

    @Override
    public void startLogoutActivity() {

    }

    @Override
    public void showOfferSuccessfulToast() {

    }

    public void showCreateOfferView(){
        Log.d(TAG, "showCreateOfferView: startet");
        replaceFragment(new CreateOfferFragment());





    }
    public void showFavoritesView(){
        Log.d(TAG, "showFavoritesView: started");

    }
}
