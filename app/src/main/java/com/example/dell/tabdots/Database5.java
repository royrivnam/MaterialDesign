package com.example.dell.tabdots;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by DELL on 13-Mar-17.
 */

public class Database5 extends Fragment {


    TextView t,tt;
    EditText e,ee;

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.database, container, false);

        t=(TextView)view.findViewById(R.id.t1);
        tt=(TextView)view.findViewById(R.id.t2);
        e=(EditText)view.findViewById(R.id.e1);
        ee=(EditText)view.findViewById(R.id.e2);
        t.setText("Name Of Bird:");
        tt.setText("Scientific Name");








        return view;

    }






}