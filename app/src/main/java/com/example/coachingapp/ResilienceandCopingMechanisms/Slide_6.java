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

public class Slide_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_6);
    }

    public void btn_next(View view) {
        Intent intent = new Intent(Slide_6.this, Slide_7.class );
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
