package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.coachingapp.R;

public class resilience_Screen30 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resilience__screen30);
    }
    public void btn_next(View view) {
        Intent intent = new Intent(resilience_Screen30.this, resilience_Screen31.class );
        startActivity(intent);
    }
    public void btn_back(View view) {
        Intent intent = new Intent(resilience_Screen30.this, Slide_17_options.class );
        startActivity(intent);
    }
}
