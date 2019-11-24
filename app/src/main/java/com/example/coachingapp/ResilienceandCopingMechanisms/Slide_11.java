package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import com.example.coachingapp.R;

public class Slide_11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_11);

        TextView ctext = (TextView)findViewById(R.id.color_text);
        String text = "Step 1. <font color = #E53935>recognise</font> when you need to take action";
        ctext.setText(Html.fromHtml(text));

        TextView ctext_2 = (TextView)findViewById(R.id.color_text_2);
        String text_2 = "<font color = #E53935>Recognise</font>  - respond - resolve";
        ctext_2.setText(Html.fromHtml(text_2));
    }
    public void btn_next(View view) {
        Intent intent = new Intent(Slide_11.this, Slide_12_Behavioural.class );
        startActivity(intent);
    }
}
