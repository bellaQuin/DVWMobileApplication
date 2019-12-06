package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.coachingapp.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Slide_12_Innerthoughts extends AppCompatActivity {

    FirebaseAuth firebaseAuth;
    FirebaseDatabase database;
    DatabaseReference myRef;
    FirebaseUser user;

    LinearLayout mLayout;

    CheckBox check_1,check_2,check_3,check_4,check_5,check_6,check_7,check_8,check_9,check_10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_12__innerthoughts);

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
    }

    public void btn_next(View view) {
        addToFirebase();
    }

    private void addToFirebase() {

        if (user != null) {
            String id = user.getUid();

            if(check_1.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_11").child("resilience_11_1").setValue("Over-burdened");
            }
            if(check_2.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_11").child("resilience_11_2").setValue("Anxious, nervous or afraid");
            }
            if(check_3.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_11").child("resilience_11_3").setValue("Unable to enjoy yourself");
            }
            if(check_4.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_11").child("resilience_11_4").setValue("Racing thoughts");
            }
            if(check_5.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_11").child("resilience_11_5").setValue("Depressed");
            }
            if(check_6.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_11").child("resilience_11_6").setValue("Uninterested in life");
            }
            if(check_7.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_11").child("resilience_11_7").setValue("Lost your sense of humuor");
            }
            if(check_8.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_11").child("resilience_11_8").setValue("A sense of dread");
            }
            if(check_9.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_11").child("resilience_11_9").setValue("Worried about your health");
            }
            if(check_10.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_11").child("resilience_11_10").setValue("Neglected or lonely");
            }

            Toast.makeText(this, "Information Saved", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Slide_12_Innerthoughts.this, Slide_13.class );
            startActivity(intent);
        }
    }
}
