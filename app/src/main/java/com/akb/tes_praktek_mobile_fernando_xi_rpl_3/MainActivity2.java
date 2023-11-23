package com.akb.tes_praktek_mobile_fernando_xi_rpl_3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    Button btnBukaTiga , btnBukalima;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnBukaTiga = findViewById(R.id.btnBukaTiga);
        btnBukalima = findViewById(R.id.btnBukalima);

        btnBukaTiga.setOnClickListener(view -> {
            Intent BukaActTiga = new Intent(getApplicationContext(), MainActivity3.class);
            startActivity(BukaActTiga);
        });

        btnBukalima.setOnClickListener(view -> {
            Intent BukaActLima = new Intent(getApplicationContext(), MainActivity5.class);
            startActivity(BukaActLima);
        });
    }
}