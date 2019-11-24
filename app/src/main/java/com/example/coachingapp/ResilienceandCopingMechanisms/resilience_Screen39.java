package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import com.example.coachingapp.R;

public class resilience_Screen39 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resilience__screen39);

        TextView ctext_2 = (TextView)findViewById(R.id.color_text_2);
        String text_2 = "Recognise  - <font color = #E53935>respond</font> - resolve";
        ctext_2.setText(Html.fromHtml(text_2));
    }

    public void btn_next(View view) {
        Intent intent = new Intent(resilience_Screen39.this, resilience_Screen40.class );
        startActivity(intent);
    }
}
