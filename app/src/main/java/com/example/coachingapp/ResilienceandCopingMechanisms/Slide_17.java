package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import com.example.coachingapp.R;

public class Slide_17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_17);

        TextView textView = (TextView)findViewById(R.id.color_text);
        String text = "One of the next screen are ways to <font color = #E53935>manage stress</font> - short term.";
        textView.setText(Html.fromHtml(text));

        TextView textView_2 = (TextView)findViewById(R.id.color_text_2);
        String text2 = "All of  these techniques teach you to <font color = #E53935>change the chemical responses in your brain and body</font> and slow the release of the stress chemicals.";
        textView_2.setText(Html.fromHtml(text2));

        TextView textView_3 = (TextView)findViewById(R.id.color_text_3);
        String text3 = "Stress chemicals = <font color = #E53935>adrenaline and cortisol.</font>";
        textView_3.setText(Html.fromHtml(text3));

        TextView textView_4 = (TextView)findViewById(R.id.color_text_4);
        String text4 = "Feel good chemicals = <font color = #FAFAFA>dopamine, oxytocin, serotonin.</font>";
        textView_4.setText(Html.fromHtml(text4));
    }

    public void btn_next(View view) {
        Intent intent = new Intent(Slide_17.this, Slide_17_options.class );
        startActivity(intent);
    }
}
