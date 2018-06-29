package com.example.michael.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class SearchOffer extends Fragment {
    private static final String TAG = "MarketplaceHome";

    private Button btnNavFrag1;
    private Button btnNavFrag2;
    private Button btnNavFrag3;
    private Button btnNavSecondActivity;
    //fragments unterscheiden sich von activity mit oncreateView statt onCreate!!!


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.search_offer_fragment, container, false);

        //difference: declaring widgets-> referencing the view
        //activity: (Button) findviewByiD, hier: view.findViewbyId!!



        return view;
        //unterschied zu activity!!! viewObject erzeugen und unten zurück geben!!!
    }
}
