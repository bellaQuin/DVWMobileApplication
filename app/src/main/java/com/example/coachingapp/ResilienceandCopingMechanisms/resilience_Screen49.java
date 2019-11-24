package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.coachingapp.R;
import com.example.coachingapp.UserDashboard;

public class resilience_Screen49 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resilience__screen49);
    }

    public void btn_next(View view) {
        Intent intent = new Intent(resilience_Screen49.this, resilience_Screen50.class );
        startActivity(intent);
    }
    public void btn_back(View view) {
        Intent intent = new Intent(resilience_Screen49.this, UserDashboard.class );
        startActivity(intent);
    }
}
