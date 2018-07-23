package com.example.a16046512.problemstatement;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag1 extends Fragment {


    private Button ChangeColor1;
    private int color =0;
    private LinearLayout f1;
    public Frag1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final View view = inflater.inflate(R.layout.fragment1, container, false);

        ChangeColor1 = (Button)view.findViewById(R.id.ChangeColor1);
        f1 = (LinearLayout) view.findViewById(R.id.f1);
        f1.setBackgroundColor(Color.parseColor("#3399ff"));

        ChangeColor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList al = new ArrayList();
                al.add("#ffe99b");
                al.add("#9bb1ff");
                al.add("#e99790");
                al.add("#9999ff");
                al.add("#33ffcc");
                al.add("#b6fcd5");
                al.add("#3399ff");
                Log.i("color",color+":"+al.size());
                if (color==al.size()){
                    color=0;
                    f1.setBackgroundColor(Color.parseColor(al.get(0).toString()));

                }else{
                    f1.setBackgroundColor(Color.parseColor(al.get(color).toString()));
                    color=color+1;

                }


            }
        });
        return view;
    }

}
