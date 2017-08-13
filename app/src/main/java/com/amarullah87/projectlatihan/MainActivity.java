package com.amarullah87.projectlatihan;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnShow;
    LinearLayout content;
    boolean buka = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShow = (Button) findViewById(R.id.btn1);
        content = (LinearLayout) findViewById(R.id.content);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buka == false){
                    content.setVisibility(View.VISIBLE);
                    buka = true;
                }else{
                    content.setVisibility(View.GONE);
                    buka = false;
                }
            }
        });
    }

}
