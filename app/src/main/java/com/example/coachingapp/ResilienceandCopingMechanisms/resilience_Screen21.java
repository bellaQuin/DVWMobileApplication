package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.coachingapp.R;

public class resilience_Screen21 extends AppCompatActivity {

    ImageButton btn_1,btn_2,btn_3,btn_4;
    Dialog Dialog_1,Dialog_2,Dialog_3,Dialog_4;
    ImageButton back_1,back_2,back_3,back_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resilience__screen21);

        btn_1 = (ImageButton) findViewById(R.id.btn_image_1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Image_1_Dialog();
            }
        });

        btn_2 = (ImageButton) findViewById(R.id.btn_image_2);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Image_2_Dialog();
            }
        });

        btn_3 = (ImageButton) findViewById(R.id.btn_image_3);
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Image_3_Dialog();
            }
        });

        btn_4 = (ImageButton) findViewById(R.id.btn_image_4);
        btn_4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Image_4_Dialog();
            }
        });
    }

    public void Image_1_Dialog(){
        Dialog_1 = new Dialog(resilience_Screen21.this);
        Dialog_1.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Dialog_1.setContentView(R.layout.image_1_dialog);
        Dialog_1.setTitle("");

        back_1 = (ImageButton) Dialog_1.findViewById(R.id.btn_back_1);

        back_1.setEnabled(true);

        back_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog_1.cancel();
            }
        });
        Dialog_1.show();
    }

    public void Image_2_Dialog(){
        Dialog_2 = new Dialog(resilience_Screen21.this);
        Dialog_2.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Dialog_2.setContentView(R.layout.image_2_dialog);
        Dialog_2.setTitle("");

        back_2 = (ImageButton) Dialog_2.findViewById(R.id.btn_back_2);

        back_2.setEnabled(true);

        back_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog_2.cancel();
            }
        });
        Dialog_2.show();
    }

    public void Image_3_Dialog(){
        Dialog_3 = new Dialog(resilience_Screen21.this);
        Dialog_3.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Dialog_3.setContentView(R.layout.image_3_dialog);
        Dialog_3.setTitle("");

        back_3 = (ImageButton) Dialog_3.findViewById(R.id.btn_back_3);

        back_3.setEnabled(true);

        back_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog_3.cancel();
            }
        });
        Dialog_3.show();
    }

    public void Image_4_Dialog(){
        Dialog_4 = new Dialog(resilience_Screen21.this);
        Dialog_4.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Dialog_4.setContentView(R.layout.image_4_dialog);
        Dialog_4.setTitle("");

        back_4 = (ImageButton) Dialog_4.findViewById(R.id.btn_back_4);

        back_4.setEnabled(true);

        back_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog_4.cancel();
            }
        });
        Dialog_4.show();
    }

    public void btn_next(View view) {
        Intent intent = new Intent(resilience_Screen21.this, resilience_Screen22.class );
        startActivity(intent);
    }
    public void btn_back(View view) {
        Intent intent = new Intent(resilience_Screen21.this, Slide_17_options.class );
        startActivity(intent);
    }
}
