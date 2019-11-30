package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.coachingapp.R;

public class resilience_Screen24 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resilience__screen24);
    }

    public void btn_show(View view) {
        Intent intent = new Intent(resilience_Screen24.this, resilience_Screen21.class );
        startActivity(intent);
    }

    public void btn_next(View view) {
        Intent intent = new Intent(resilience_Screen24.this, resilience_Screen26.class );
        startActivity(intent);
    }

    public void btn_back(View view) {
        Intent intent = new Intent(resilience_Screen24.this, Slide_17_options.class );
        startActivity(intent);
    }
}
