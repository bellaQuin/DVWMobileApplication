package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.coachingapp.R;

public class Slide_10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_10);
    }
    public void btn_next(View view) {
        Intent intent = new Intent(Slide_10.this, Slide_11.class );
        startActivity(intent);
    }
}
