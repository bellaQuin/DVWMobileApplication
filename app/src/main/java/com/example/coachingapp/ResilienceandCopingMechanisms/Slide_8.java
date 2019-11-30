package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.coachingapp.R;

public class Slide_8 extends AppCompatActivity {

    Button btn_1,btn_2,btn_3,btn_4,btn_5;
    Dialog Dialog_1,Dialog_2,Dialog_3,Dialog_4,Dialog_5;
    Button next_1,next_2,next_3,next_4,next_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_8);

        btn_1 = (Button) findViewById(R.id.btn_Hyper_vigilance);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hyper_vigilanceDialog();
            }
        });

        btn_2 = (Button) findViewById(R.id.Blood);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BloodDialog();
            }
        });

        btn_3 = (Button) findViewById(R.id.Threat_detected);
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Threat_detectedDialog();
            }
        });

        btn_4 = (Button) findViewById(R.id.Brain_says);
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Brain_saysDialog();
            }
        });

        btn_5 = (Button) findViewById(R.id.Chemicals);
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChemicalsDialog();
            }
        });
    }

    public void Hyper_vigilanceDialog(){
        Dialog_1 = new Dialog(Slide_8.this);
        Dialog_1.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Dialog_1.setContentView(R.layout.hyper_vigilance_dialog);
        Dialog_1.setTitle("Hyper vigilance");

        next_1 = (Button)Dialog_1.findViewById(R.id.btn_next_1);

        next_1.setEnabled(true);

        next_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog_1.cancel();
            }
        });
        Dialog_1.show();
    }

    public void BloodDialog(){
        Dialog_2 = new Dialog(Slide_8.this);
        Dialog_2.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Dialog_2.setContentView(R.layout.blood_dialog);
        Dialog_2.setTitle("Hyper vigilance");

        next_2 = (Button)Dialog_2.findViewById(R.id.btn_next_2);

        next_2.setEnabled(true);

        next_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog_2.cancel();
            }
        });
        Dialog_2.show();
    }

    public void Threat_detectedDialog(){
        Dialog_3 = new Dialog(Slide_8.this);
        Dialog_3.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Dialog_3.setContentView(R.layout.threat_detected_dialog);
        Dialog_3.setTitle("Hyper vigilance");

        next_3 = (Button)Dialog_3.findViewById(R.id.btn_next_3);

        next_3.setEnabled(true);

        next_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog_3.cancel();
            }
        });
        Dialog_3.show();
    }

    public void Brain_saysDialog(){
        Dialog_4 = new Dialog(Slide_8.this);
        Dialog_4.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Dialog_4.setContentView(R.layout.brain_says_dialog);
        Dialog_4.setTitle("Hyper vigilance");

        next_4 = (Button)Dialog_4.findViewById(R.id.btn_next_4);

        next_4.setEnabled(true);

        next_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog_4.cancel();
            }
        });
        Dialog_4.show();
    }

    public void ChemicalsDialog(){
        Dialog_5 = new Dialog(Slide_8.this);
        Dialog_5.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Dialog_5.setContentView(R.layout.chemicals_dialog);
        Dialog_5.setTitle("Hyper vigilance");

        next_5 = (Button)Dialog_5.findViewById(R.id.btn_next_5);

        next_5.setEnabled(true);

        next_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog_5.cancel();
            }
        });
        Dialog_5.show();
    }


    public void btn_next(View view) {
        Intent intent = new Intent(Slide_8.this, Slide_9_DNA.class );
        startActivity(intent);
    }
}
