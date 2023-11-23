package com.akb.tes_praktek_mobile_fernando_xi_rpl_3;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity5 extends AppCompatActivity {

    Button btnBukatiga;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btnBukatiga = (Button) findViewById(R.id.btnback3);
        btnBukatiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaActTiga= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(BukaActTiga);
            }
        });
    }
}