package com.example.novelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Button tombolSelanjutnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tombolSelanjutnya = findViewById(R.id.btn_selanjutnya);

        tombolSelanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHalamanSelanjutnya = new Intent(getApplicationContext(), Halaman2Activity.class);
                startActivity(intentHalamanSelanjutnya);
                finish();
            }
        });
    }
}
