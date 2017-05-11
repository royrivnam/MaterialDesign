package com.example.dell.tabdots;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by DELL on 13-Mar-17.
 */

public class Database3 extends Fragment implements RadioGroup.OnCheckedChangeListener{


    TextView t,tt;
    EditText e,ee;
    RadioGroup RR;
    RadioButton RR1,RR2,RR3;

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.database3, container, false);

        t=(TextView)view.findViewById(R.id.t1);
        RR = (RadioGroup) view.findViewById(R.id.radiogroup);
        RR1=(RadioButton)view.findViewById(R.id.r1);
        RR2=(RadioButton)view.findViewById(R.id.r2);
        RR3=(RadioButton)view.findViewById(R.id.r3);
        RR.setOnCheckedChangeListener(this);



        return view;

    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

    }
}