package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.coachingapp.R;

public class Slide_18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_18);
    }

    public void btn_next(View view) {
        Intent intent = new Intent(Slide_18.this, Slide_19.class );
        startActivity(intent);
    }
    public void btn_back(View view) {
        Intent intent = new Intent(Slide_18.this, Slide_17_options.class );
        startActivity(intent);
    }
}
