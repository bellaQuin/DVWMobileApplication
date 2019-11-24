package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.coachingapp.R;

public class Slide_17_options extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_17_options);
    }

    public void btn_Breathing_and_pulse_rate(View view) {
        Intent intent = new Intent(Slide_17_options.this, Slide_18.class );
        startActivity(intent);
    }

    public void btn_Positive_images(View view) {
        Intent intent = new Intent(Slide_17_options.this, Slide_19.class );
        startActivity(intent);
    }

    public void btn_next(View view) {
        Intent intent = new Intent(Slide_17_options.this, Slide_18.class );
        startActivity(intent);
    }
}
