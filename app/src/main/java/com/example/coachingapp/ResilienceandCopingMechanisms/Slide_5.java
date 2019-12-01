package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.view.View;

import com.example.coachingapp.R;

public class Slide_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_5);
    }

    public void btn_next(View view) {
        Intent intent = new Intent(Slide_5.this, Slide_6.class);
        startActivity(intent);
    }

    public void btnrecognise(View view) {
        Intent intent = new Intent(Slide_5.this, Slide_11.class);
        startActivity(intent);
    }

    private void arletDialogBox(){
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Are you sure?");
        alertDialog.setMessage("Are you sure you would like to jump ahead to this section");
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(Slide_5.this, Slide_11.class);
//                        startActivity(intent);
            }
        });
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
//                .setMessage("Are you sure you would like to jump ahead to this section")
//                .setCancelable(true)
//                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        Intent intent = new Intent(Slide_5.this, Slide_11.class);
//                        startActivity(intent);
//                    }
//                })
//                .setNegativeButton("No", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                });


    }

}

