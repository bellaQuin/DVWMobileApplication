package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.example.coachingapp.R;

public class Slide_9_DNA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_9__dn);

        TextView textView = (TextView)findViewById(R.id.color_text);
        String text = "Its in our DNA. We are designed to stay alive and survive an attack. Chemicals such as <font color = #E53935>cortisol and adrenaline can keep us alive when we are in physical danger</font> (under attack). ";
        textView.setText(Html.fromHtml(text));
    }

    public void btn_next(View view) {
        Intent intent = new Intent(Slide_9_DNA.this, Slide_9_Brain.class );
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
