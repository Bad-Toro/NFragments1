package com.mobileappscompany.training.nfragments1;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements BlankFragment.MFI{
    BlankFragment bf;
    TextView tV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tV = (TextView) findViewById(R.id.textView) ;

        if(savedInstanceState != null)return;

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();


        bf = new BlankFragment();

        ft.add(R.id.theFL, bf);

        ft.commit();


    }

    @Override
    public void setTheText(String s) {
        tV.setText(s);
    }
}
