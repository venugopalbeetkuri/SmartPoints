package com.pointhub.earnredeemtab;

import android.app.DatePickerDialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.pointhub.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import static android.widget.Spinner.*;
import static com.pointhub.R.id.spinner1;


public class Reedem extends Fragment {

    private Spinner spinner;
    View v;
    public Reedem() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.reedem, container, false);
        findViewByid(v);
        setSpinnerCategories();

        return v;
    }
    private void findViewByid(View v){

        spinner=(Spinner)v.findViewById(R.id.spinner1);

    }

    private  void setSpinnerCategories(){
        // Spinner Drop down elements
        //final String[] purpose = {"100","150","200"};

        // Creating adapter for spinner
        //ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, purpose);


        // Drop down layout style - list view with radio button
        //dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        // attaching data adapter to spinner
        //spinner.setAdapter(dataAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                    spurpose = parent.getItemAtPosition(position).toString();
//                // Showing selected spinner item
//                Toast.makeText(parent.getContext(), "Selected: " + spurpose, Toast.LENGTH_LONG).show();
//                smetal = parent.getItemAtPosition(position).toString();
//                // Showing selected spinner item

                //Toast.makeText(getContext(), "Selected: " +purpose[position], Toast.LENGTH_SHORT).show();
                Toast.makeText(getActivity(),"You Selected  "   +String.valueOf(spinner.getSelectedItem()),Toast.LENGTH_LONG).show();


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


}


