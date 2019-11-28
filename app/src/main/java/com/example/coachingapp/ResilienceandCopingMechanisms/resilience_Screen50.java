package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.coachingapp.R;

public class resilience_Screen50 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resilience__screen50);
    }

    public void btn_Recognise(View view) {
        Intent intent = new Intent(resilience_Screen50.this, resilience_Screen51.class );
        startActivity(intent);
    }

    public void btn_Response(View view) {
        Intent intent = new Intent(resilience_Screen50.this, resilience_Screen51.class );
        startActivity(intent);
    }

    public void btn_Resolve(View view) {
        Intent intent = new Intent(resilience_Screen50.this, resilience_Screen51.class );
        startActivity(intent);
    }

    public void btn_next(View view) {
        Intent intent = new Intent(resilience_Screen50.this, resilience_Screen51.class );
        startActivity(intent);
    }
}
