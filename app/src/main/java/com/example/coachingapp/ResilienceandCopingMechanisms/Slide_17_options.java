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
        Intent intent = new Intent(Slide_17_options.this, resilience_Screen20.class );
        startActivity(intent);
    }

    public void btn_Music(View view) {
        Intent intent = new Intent(Slide_17_options.this, resilience_Screen22.class );
        startActivity(intent);
    }

    public void btn_Videos(View view) {
        Intent intent = new Intent(Slide_17_options.this, resilience_Screen22.class );
        startActivity(intent);
    }


    public void btn_Exercise(View view) {
        Intent intent = new Intent(Slide_17_options.this, resilience_Screen26.class );
        startActivity(intent);
    }



    public void btn_Stance(View view) {
        Intent intent = new Intent(Slide_17_options.this, resilience_Screen27.class );
        startActivity(intent);
    }



    public void btn_Gratefulness(View view) {
        Intent intent = new Intent(Slide_17_options.this, resilience_Screen28.class );
        startActivity(intent);
    }


    public void btn_Using_nature(View view) {
        Intent intent = new Intent(Slide_17_options.this, resilience_Screen30.class );
        startActivity(intent);
    }

    public void btn_Saying_no(View view) {
        Intent intent = new Intent(Slide_17_options.this, resilience_Screen31.class );
        startActivity(intent);
    }

    public void btn_Meditation_and_Mindfulness(View view) {
        Intent intent = new Intent(Slide_17_options.this, resilience_Screen34.class );
        startActivity(intent);
    }

    public void btn_Purpose_and_meaning(View view) {
        Intent intent = new Intent(Slide_17_options.this, resilience_Screen35.class );
        startActivity(intent);
    }

    public void btn_next(View view) {
        Intent intent = new Intent(Slide_17_options.this, Slide_18.class );
        startActivity(intent);
    }
}
