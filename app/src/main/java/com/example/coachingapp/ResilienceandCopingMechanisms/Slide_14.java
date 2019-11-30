package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import com.example.coachingapp.R;

public class Slide_14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_14);

        TextView ctext = (TextView)findViewById(R.id.color_text);
        String text = "Step 1. <font color = #E53935>recognise</font> Take short term action to keep yourself safe";
        ctext.setText(Html.fromHtml(text));

        TextView ctext_2 = (TextView)findViewById(R.id.color_text_2);
        String text_2 = "Recognise  - <font color = #E53935>respond</font> - resolve";
        ctext_2.setText(Html.fromHtml(text_2));
    }
    public void btn_next(View view) {
        Intent intent = new Intent(Slide_14.this, Slide_15.class );
        startActivity(intent);
    }
}
