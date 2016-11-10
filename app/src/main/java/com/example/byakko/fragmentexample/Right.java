package com.example.byakko.fragmentexample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by macbook on 09/11/16.
 */

public class Right extends Fragment {
    View rootView;
    TextView text;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedIstanceState){
        rootView = inflater.inflate(R.layout.right, container, false);
        text = (TextView) rootView.findViewById(R.id.text);
        return rootView;
    }

    public void getData(String message){
        text.setText(message);
    }
}
