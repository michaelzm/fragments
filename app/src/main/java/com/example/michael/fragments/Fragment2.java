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

public class Fragment2 extends Fragment {
    private static final String TAG = "Fragment1";

    private Button btnNavFrag1;
    private Button btnNavFrag2;
    private Button btnNavFrag3;
    private Button btnNavSecondActivity;
    //fragments unterscheiden sich von activity mit oncreateView statt onCreate!!!


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment2_layout, container, false);

        //difference: declaring widgets-> referencing the view
        //activity: (Button) findviewByiD, hier: view.findViewbyId!!

        btnNavFrag1=(Button) view.findViewById(R.id.btnNavFrag1);
        btnNavFrag2=(Button) view.findViewById(R.id.btnNavFrag2);
        btnNavFrag3=(Button) view.findViewById(R.id.btnNavFrag3);
        btnNavSecondActivity=(Button) view.findViewById(R.id.btnNavSecondActivity);
        Log.d(TAG, "onCreateView: started");

        btnNavFrag1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                //unterschied activity: nicht mit this referenzieren oder activity.this
                Toast.makeText(getActivity(), "Going to Fragment1", Toast.LENGTH_SHORT).show();

                //(()) gibt access auf methoden in mainactivity
                // 0 für fragment 0, da in liste platz 0
                ((MainActivity)getActivity()).setmViewPager(0);
            }
        });

        btnNavFrag2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                //unterschied activity: nicht mit this referenzieren oder activity.this
                Toast.makeText(getActivity(), "Going to Fragment2", Toast.LENGTH_SHORT).show();
                //navigate to fragment method called
                ((MainActivity)getActivity()).setmViewPager(1);
            }
        });

        btnNavFrag3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                //unterschied activity: nicht mit this referenzieren oder activity.this
                Toast.makeText(getActivity(), "Going to Fragment3", Toast.LENGTH_SHORT).show();
                //navigate to fragment method called
                ((MainActivity)getActivity()).setmViewPager(2);
            }
        });
        //um zu activity 2 zu wechseln
        btnNavSecondActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                //unterschied activity: nicht mit this referenzieren oder activity.this
                Toast.makeText(getActivity(), "Going to Second Activity", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                startActivity(intent);
            }
        });


        return view;
        //unterschied zu activity!!! viewObject erzeugen und unten zurück geben!!!
    }
}
