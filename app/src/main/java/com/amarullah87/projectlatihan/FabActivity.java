package com.amarullah87.projectlatihan;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class FabActivity extends AppCompatActivity {

    Snackbar snackbar;
    CoordinatorLayout parentPanel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        parentPanel = (CoordinatorLayout) findViewById(R.id.parentPanel);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Menampilkan Snackbar
                snackbar = Snackbar
                        .make(parentPanel, "Test~~~~~~~~~~~~~~~~~~~~~", Snackbar.LENGTH_INDEFINITE)
                        .setAction("OK", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                //Simpen Action apapun itu disini
                            }
                        });
                snackbar.setActionTextColor(Color.GREEN);
                View sbView = snackbar.getView();
                TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
                textView.setTextColor(Color.RED);
                snackbar.show();

                //Untuk Proses Pemanggilan Fragment
                /*FragmentManager fragmentManager = getSupportFragmentManager();
                BodyPartFragment bodyFragment = new BodyPartFragment();
                fragmentManager.beginTransaction()
                        .add(R.id.body_container, bodyFragment)
                        .commit();*/
            }
        });
    }

}
