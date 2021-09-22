package com.example.mad_pet_doctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.chip.Chip;

public class IntroductionCat extends AppCompatActivity {

    private Chip HomeChip1, HomeChip2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introduction_cat);

        HomeChip1 = findViewById(R.id.chip9);
        HomeChip2 = findViewById(R.id.chip13);

        HomeChip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntroductionCat.this, ActivityMainSideBar.class));
            }
        });
        HomeChip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntroductionCat.this, ActivityMainSideBar.class));
            }
        });
    }
}