package com.example.michael.fragments;

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

public class MarketplaceHome extends Fragment {
    private static final String TAG = "Marketplace Home";

    private Button bt_mp_create_offer;
    private Button bt_mp_search_offers;
    private Button bt_mp_favorites;
    private Button bt_mp_show_offer;
    //fragments unterscheiden sich von activity mit oncreateView statt onCreate!!!


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.marketplace_home_fragment, container, false);

        //difference: declaring widgets-> referencing the view
        //activity: (Button) findviewByiD, hier: view.findViewbyId!!

        bt_mp_create_offer=(Button) view.findViewById(R.id.bt_mp_create_offer);
        bt_mp_favorites=(Button) view.findViewById(R.id.bt_mp_favorites);
        bt_mp_search_offers=(Button) view.findViewById(R.id.btnNavFrag1);
        bt_mp_show_offer=(Button) view.findViewById(R.id.bt_mp_show_offers);

        Log.d(TAG, "onCreateView: started");

        bt_mp_create_offer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                //unterschied activity: nicht mit this referenzieren oder activity.this
                Toast.makeText(getActivity(), "Angebot erstellen", Toast.LENGTH_SHORT).show();

                //(()) gibt access auf methoden in mainactivity
                // 0 für fragment 0, da in liste platz 0
                ((MainActivity)getActivity()).setViewPager(1);
            }
        });

        bt_mp_favorites.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                //unterschied activity: nicht mit this referenzieren oder activity.this
                Toast.makeText(getActivity(), "Favoriten", Toast.LENGTH_SHORT).show();
                //navigate to fragment method called
                ((MainActivity)getActivity()).setViewPager(1);
            }
        });
        /*
        bt_mp_search_offers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                //unterschied activity: nicht mit this referenzieren oder activity.this
                Toast.makeText(getActivity(), "Going to SearchOffer", Toast.LENGTH_SHORT).show();
                //navigate to fragment method called
                ((MainActivity)getActivity()).setViewPager(2);
            }
        });

        /*
        bt_mp_show_offer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                //unterschied activity: nicht mit this referenzieren oder activity.this
                Toast.makeText(getActivity(), "Going to Second Activity", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                startActivity(intent);
            }
        });
        */

        return view;
        //unterschied zu activity!!! viewObject erzeugen und unten zurück geben!!!
    }
}
