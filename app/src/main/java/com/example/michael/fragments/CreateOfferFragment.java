package com.example.michael.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.app.FragmentManager;

public class CreateOfferFragment extends Fragment {
    private static final String TAG = "MarketplaceHome";


    //fragments unterscheiden sich von activity mit oncreateView statt onCreate!!!
    private Button bt_publish;
    private Button bt_addPic;
    private Button bt_addGeo;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.create_offer_fragment, container, false);
        bt_publish=(Button) view.findViewById(R.id.bt_co_publish_offer);
        bt_addPic=(Button) view.findViewById(R.id.bt_co_add_pic);
        bt_addGeo=(Button) view.findViewById(R.id.bt_co_add_geo);



        bt_publish.setOnClickListener(new View.OnClickListener(){


                @Override
                public void onClick(View view){

                    //unterschied activity: nicht mit this referenzieren oder activity.this


                    //(()) gibt access auf methoden in mainactivity
                    // 0 für fragment 0, da in liste platz 0
                    ((MainActivity)getActivity()).setViewPager(0);
                }
                });
        bt_addGeo.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view){

                //unterschied activity: nicht mit this referenzieren oder activity.this


                //(()) gibt access auf methoden in mainactivity
                // 0 für fragment 0, da in liste platz 0

            }
        });






        //difference: declaring widgets-> referencing the view
        //activity: (Button) findviewByiD, hier: view.findViewbyId!!
        Log.d(TAG, "onCreateView: started");
        return view;
        //unterschied zu activity!!! viewObject erzeugen und unten zurück geben!!!


    }



}
