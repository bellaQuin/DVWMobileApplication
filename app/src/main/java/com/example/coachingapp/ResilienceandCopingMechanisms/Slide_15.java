package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import com.example.coachingapp.R;

public class Slide_15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_15);

        TextView ctext = (TextView)findViewById(R.id.color_text);
        String text = "It's vital to the respond to a situation by taking short term action, to keep yourself <font color = #E53935>safe and think clearly.</font>";
        ctext.setText(Html.fromHtml(text));

        TextView ctext_2 = (TextView)findViewById(R.id.color_text_2);
        String text_2 = "Under stress our brain releases a chemical called <font color = #E53935>cortisol.</font>";
        ctext_2.setText(Html.fromHtml(text_2));

        TextView ctext_3 = (TextView)findViewById(R.id.color_text_3);
        String text_3 = "However,conrtisol preventsus from multi-tasking. solving complex problems or <font color = #E53935>responding calmly.</font>";
        ctext_2.setText(Html.fromHtml(text_3));
    }
    public void btn_next(View view) {
        Intent intent = new Intent(Slide_15.this, Slide_16.class );
        startActivity(intent);
    }
}
