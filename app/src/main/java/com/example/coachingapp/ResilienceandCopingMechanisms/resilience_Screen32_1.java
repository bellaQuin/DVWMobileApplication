package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.coachingapp.R;

public class resilience_Screen32_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resilience__screen32_1);
    }

    public void btn_next(View view) {
        Intent intent = new Intent(resilience_Screen32_1.this, resilience_Screen32_2.class );
        startActivity(intent);
    }
    public void btn_back(View view) {
        Intent intent = new Intent(resilience_Screen32_1.this, Slide_17_options.class );
        startActivity(intent);
    }
}
