package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.coachingapp.R;

public class Slide_9_Heart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_9__heart);
    }

    public void btn_next(View view) {
        Intent intent = new Intent(Slide_9_Heart.this, Slide_10.class );
        startActivity(intent);
    }
}
