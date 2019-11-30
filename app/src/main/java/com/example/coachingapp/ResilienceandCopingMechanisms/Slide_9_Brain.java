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

public class Slide_9_Brain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_9__brain);

        TextView textView = (TextView)findViewById(R.id.color_text);
        String text = "In an office or home environment this is not very useful, in fact it <font color = #E53935>can make the situation worse</font>. For example cortisol also reduces our working memory and ability to solve complex problems; not things we normally need to do when we are under physical attack";
        textView.setText(Html.fromHtml(text));
    }

    public void btn_next(View view) {
        Intent intent = new Intent(Slide_9_Brain.this, Slide_9_Heart.class );
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
