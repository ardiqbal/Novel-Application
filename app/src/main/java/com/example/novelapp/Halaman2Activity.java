package com.example.novelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Halaman2Activity extends AppCompatActivity {

    Button tombolSebelumnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);

        tombolSebelumnya = findViewById(R.id.btn_sebelumnya);

        tombolSebelumnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHalamanSebelumnya = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentHalamanSebelumnya);
                finish();
            }
        });
    }
}
