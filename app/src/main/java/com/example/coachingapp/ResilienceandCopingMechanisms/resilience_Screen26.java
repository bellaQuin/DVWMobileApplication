package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.coachingapp.R;

public class resilience_Screen26 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resilience__screen26);
    }
    public void btn_next(View view) {
        Intent intent = new Intent(resilience_Screen26.this, resilience_Screen26_cONT.class );
        startActivity(intent);
    }
}
