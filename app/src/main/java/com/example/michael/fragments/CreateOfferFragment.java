package com.example.michael.fragments;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.app.FragmentManager;

import com.example.michael.fragments.Interfaces.MarketplaceInterfaceView;

public class CreateOfferFragment extends Fragment implements MarketplaceInterfaceView {
    private static final String TAG = "MarketplaceHomeFragment";

    @Override
    public void showOfferSuccessfulToast() {

    }

    @Override
    public void startLogoutActivity() {

    }

    //fragments unterscheiden sich von activity mit oncreateView statt onCreate!!!
    private Button bt_publish;
    private Button bt_addPic;
    private Button bt_addGeo;
    private EditText title;
    private EditText description;
    private EditText geo;

    MarketplacePresenter presenter;
    /*
   yet to use:
    public static CreateOfferFragment newInstance(){
        return new CreateOfferFragment();
    }
    */

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.create_offer_fragment, container, false);
        bt_publish=(Button) view.findViewById(R.id.bt_co_publish_offer);
        bt_addPic=(Button) view.findViewById(R.id.bt_co_add_pic);

        title=(EditText) view.findViewById(R.id.text_input_title);
        description=(EditText) view.findViewById(R.id.text_input_description);
        geo=(EditText) view.findViewById(R.id.text_input_geo);


        bt_publish.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View view){

                }
                });

        //difference: declaring widgets-> referencing the view
        //activity: (Button) findviewByiD, hier: view.findViewbyId!!
        Log.d(TAG, "onCreateView: started");
        return view;
        //unterschied zu activity!!! viewObject erzeugen und unten zurück geben!!!


    }

    public void chooseOffer(){

    }



}
