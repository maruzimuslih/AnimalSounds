package com.example.lenovo.animalsounds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button
                rumah = (Button) findViewById(R.id.btn_rumah),
                peternakan = (Button) findViewById(R.id.btn_peternakan),
                hutan = (Button) findViewById(R.id.btn_hutan);

        rumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rmh = new Intent(MenuActivity.this, RumahActivity.class);
                startActivity(rmh);
            }
        });

        peternakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ptr = new Intent(MenuActivity.this, PeternakanActivity.class);
                startActivity(ptr);
            }
        });

        hutan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent htn = new Intent(MenuActivity.this, HutanActivity.class);
                startActivity(htn);
            }
        });

    }
}
