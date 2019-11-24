package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.coachingapp.Issues_Problems.IP_QuestionTwo;
import com.example.coachingapp.Issues_Problems.IP_Question_Five_Part_One;
import com.example.coachingapp.R;

public class Slide_16_choices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_16_choices);
    }

    public void resilience(View view) {
        Intent intent = new Intent(Slide_16_choices.this, Slide_17.class);
        startActivity(intent);
    }

    public void contact_number(View view) {
        Intent intent = new Intent(Slide_16_choices.this, IP_Question_Five_Part_One.class);
        startActivity(intent);
    }

    public void btn_next(View view) {
        Intent intent = new Intent(Slide_16_choices.this, Slide_17.class );
        startActivity(intent);
    }
}
