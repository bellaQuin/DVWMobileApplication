package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.coachingapp.R;

public class Slide_12_Innerthoughts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_12__innerthoughts);
    }

    public void btn_next(View view) {
        Intent intent = new Intent(Slide_12_Innerthoughts.this, Slide_13.class );
        startActivity(intent);
    }
}
