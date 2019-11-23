package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.coachingapp.R;

public class Slide_19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_19);
    }

    public void btn_next(View view) {
        Intent intent = new Intent(Slide_19.this, resilience_Screen20.class );
        startActivity(intent);
    }
    public void btn_back(View view) {
        Intent intent = new Intent(Slide_19.this, Slide_17_options.class );
        startActivity(intent);
    }
}
