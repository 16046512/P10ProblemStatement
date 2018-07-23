package com.example.a16046512.problemstatement;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag2 extends Fragment {

    private Button ChangeColor2;
    private int color =0;
    private LinearLayout f2;

    public Frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment2, container, false);

        ChangeColor2 = (Button)view.findViewById(R.id.ChangeColor2);
        f2 = (LinearLayout) view.findViewById(R.id.f2);
        f2.setBackgroundColor(Color.parseColor("#b6fcd5"));

        ChangeColor2.setOnClickListener(new View.OnClickListener() {
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
                    f2.setBackgroundColor(Color.parseColor(al.get(0).toString()));

                }else{
                    f2.setBackgroundColor(Color.parseColor(al.get(color).toString()));
                    color=color+1;

                }


            }
        });
        return view;
    }

}
