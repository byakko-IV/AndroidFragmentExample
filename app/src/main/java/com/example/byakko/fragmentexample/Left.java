package com.example.byakko.fragmentexample;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by macbook on 08/11/16.
 */

public class Left extends Fragment {
    View rootView;
    Send sm;
    EditText etField;
    Button button;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedIstanceState){
        rootView = inflater.inflate(R.layout.left, container, false);

        etField = (EditText) rootView.findViewById(R.id.etField);
        button = (Button) rootView.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message;
                message = etField.getText().toString();
                sm.sendData(message);
            }
        });

        return rootView;
    }

    public void onAttach(Activity activity){
        super.onAttach(activity);
        try{
            sm = (Send) activity;
        }catch(ClassCastException e){
            throw new ClassCastException("Necesitas Implmentar");
        }
    }
}
