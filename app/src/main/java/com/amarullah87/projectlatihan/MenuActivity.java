package com.amarullah87.projectlatihan;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by apandhis on 10/08/17.
 */

public class MenuActivity extends AppCompatActivity {

    Button btnLayouting, btnFab;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnLayouting = (Button) findViewById(R.id.btnLayouting);
        btnFab = (Button) findViewById(R.id.btnFab);

        btnLayouting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, FabActivity.class);
                startActivity(intent);
            }
        });
    }
}
