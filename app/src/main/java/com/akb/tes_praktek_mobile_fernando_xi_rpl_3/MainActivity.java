package com.akb.tes_praktek_mobile_fernando_xi_rpl_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnBukaSatu, btnBukaDua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBukaSatu = (Button) findViewById(R.id.btnBukaSatu);
        btnBukaDua = (Button) findViewById(R.id.btnBukaDua);

        btnBukaSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaActSatu = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(BukaActSatu);
            }
        });

        btnBukaDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BukaDua();
            }
        });
    }

    public void BukaDua(){
        Intent BukaActempat = new Intent(getApplicationContext(), MainActivity4.class);
        startActivity(BukaActempat);

    }
}