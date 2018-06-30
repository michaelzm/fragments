package com.example.michael.fragments;

import android.util.Log;
import android.widget.Toast;

import com.example.michael.fragments.Interfaces.MarketplaceInterfacePresenter;

public class MarketplacePresenter extends MarketplaceView implements MarketplaceInterfacePresenter {
    private static String TAG = "MarketplacePresenter";
    MarketplaceView mpv = new MarketplaceView();


    public void onCreateOfferClicked() {
        Log.d("TAG", "onCreateOfferClicked: ausgeführt ");

        showCreateOfferView();


    }

    @Override
    public void onSearchOffersClicked() {

    }

    @Override
    public void onFavoritesClicked() {
        Log.d(TAG, "onFavoritesClicked: ausgeführt");
        showFavoritesView();

    }

    @Override
    public void onShowOffersClicked() {

    }
}
