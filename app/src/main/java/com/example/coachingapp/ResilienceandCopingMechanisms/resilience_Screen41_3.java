package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.coachingapp.R;

public class resilience_Screen41_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resilience__screen41_3);
    }
    public void btn_next(View view) {
        Intent intent = new Intent(resilience_Screen41_3.this, resilience_Screen42.class );
        startActivity(intent);
    }
}
