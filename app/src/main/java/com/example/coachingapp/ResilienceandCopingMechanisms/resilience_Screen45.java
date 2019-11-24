package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.coachingapp.R;

public class resilience_Screen45 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resilience__screen45);
    }
    public void btn_next(View view) {
        Intent intent = new Intent(resilience_Screen45.this, resilience_Screen46.class );
        startActivity(intent);
    }
}
