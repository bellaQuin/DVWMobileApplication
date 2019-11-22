package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.example.coachingapp.R;

public class Slide_7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_7);
    }

    public void btn_next(View view) {
        Intent intent = new Intent(Slide_7.this, Slide_8.class );
        startActivity(intent);
    }

    public void setTimer(){
        final Button button = (Button)findViewById(R.id.next);
        final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_in);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                button.setVisibility(View.VISIBLE);
                button.startAnimation(animation);


            }
        },4000);
    }
}
