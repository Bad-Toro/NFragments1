package com.mobileappscompany.training.nfragments1;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {
    Button b;
    TextView tV;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank, container, false);

        b = (Button) v.findViewById(R.id.myBtn);
        tV = (TextView) v.findViewById(R.id.tV);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tV.setText("Bob");

                MFI mIA = (MFI) getActivity();
                mIA.setTheText("Hello");
            }
        });

        return v;
    }

    public interface MFI{
        public void setTheText(String s);
    }

}
