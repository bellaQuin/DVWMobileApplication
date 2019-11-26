package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.coachingapp.Issues_Problems.IP_Question_10;
import com.example.coachingapp.Issues_Problems.IP_Question_13;
import com.example.coachingapp.Models.Issues_13;
import com.example.coachingapp.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Slide_12_Behavioural extends AppCompatActivity {

    FirebaseAuth firebaseAuth;
    FirebaseDatabase database;
    DatabaseReference myRef;
    FirebaseUser user;

    LinearLayout mLayout;

    CheckBox check_1,check_2,check_3,check_4,check_5,check_6,check_7,check_8,check_9,check_10,check_11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_12__behavioural);

        mLayout = findViewById(R.id.steps_layouts);

        firebaseAuth = FirebaseAuth.getInstance();
        user = firebaseAuth.getCurrentUser();
        myRef = FirebaseDatabase.getInstance().getReference();
        database = FirebaseDatabase.getInstance();

        check_1 = (CheckBox) findViewById(R.id.check_1);
        check_2 = (CheckBox) findViewById(R.id.check_2);
        check_3 = (CheckBox) findViewById(R.id.check_3);
        check_4 = (CheckBox) findViewById(R.id.check_4);
        check_5 = (CheckBox) findViewById(R.id.check_5);
        check_6 = (CheckBox) findViewById(R.id.check_6);
        check_7 = (CheckBox) findViewById(R.id.check_7);
        check_8 = (CheckBox) findViewById(R.id.check_8);
        check_9 = (CheckBox) findViewById(R.id.check_9);
        check_10 = (CheckBox) findViewById(R.id.check_10);
        check_11= (CheckBox) findViewById(R.id.check_11);

    }


    public void btn_next(View view) {
        addToFirebase();
    }

    private void addToFirebase() {

        if (user != null) {
            String id = user.getUid();

            if(check_1.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_9").setValue("Constantly worrying");
            }
            if(check_2.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_9").setValue("Avoiding situations that are");
            }
            if(check_3.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_9").setValue("Troubling you");
            }
            if(check_4.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_9").setValue("Snapping at people");
            }
            if(check_5.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_9").setValue("Biting your nails");
            }
            if(check_6.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_9").setValue("Picking at your skin");
            }
            if(check_7.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_9").setValue("Unable to concentrate");
            }
            if(check_8.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_9").setValue("Eating too much or too little");
            }
            if(check_9.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_9").setValue("Smoking or drinking alcohol");
            }
            if(check_10.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_9").setValue("Being tearful or crying");
            }
            if(check_11.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_9").setValue("Restless, like you can't sit still");
            }

            Toast.makeText(this, "Information Saved", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Slide_12_Behavioural.this, Slide_12_Physical.class);
            startActivity(intent);
        }
    }
}
