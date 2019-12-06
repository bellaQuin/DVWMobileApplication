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

public class Slide_12_Physical extends AppCompatActivity {

    FirebaseAuth firebaseAuth;
    FirebaseDatabase database;
    DatabaseReference myRef;
    FirebaseUser user;

    LinearLayout mLayout;

    CheckBox check_1,check_2,check_3,check_4,check_5,check_6,check_7,check_8,check_9,check_10,check_11,check_12,check_13,check_14;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_12__physical);

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
        check_12= (CheckBox) findViewById(R.id.check_12);
        check_13= (CheckBox) findViewById(R.id.check_13);
        check_14= (CheckBox) findViewById(R.id.check_14);

    }


    public void btn_next(View view) {
        addToFirebase();
    }

    private void addToFirebase() {

        if (user != null) {
            String id = user.getUid();

            if(check_1.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_10").child("resilience_10_1").setValue("Panic attack");
            }
            if(check_2.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_10").child("resilience_10_2").setValue("Muscle tension");
            }
            if(check_3.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_10").child("resilience_10_3").setValue("Blurred eyesight or sore eyes");
            }
            if(check_4.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_10").child("resilience_10_4").setValue("Loss of libido");
            }
            if(check_5.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_10").child("resilience_10_5").setValue("Tired all the time");
            }
            if(check_6.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_10").child("resilience_10_6").setValue("Grinding your teeth");
            }
            if(check_7.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_10").child("resilience_10_7").setValue("Clenching your jaws");
            }
            if(check_8.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_10").child("resilience_10_8").setValue("Headches");
            }
            if(check_9.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_10").child("resilience_10_9").setValue("Chest pains");
            }
            if(check_10.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_10").child("resilience_10_10").setValue("High blood pressure");
            }
            if(check_11.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_10").child("resilience_10_11").setValue("Indigeston or heartburn");
            }
            if(check_12.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_10").child("resilience_10_12").setValue("Constipation or diarrhea");
            }
            if(check_13.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_10").child("resilience_10_13").setValue("Feeling sick, dizzy or fainting");
            }
            if(check_14.isChecked()) {
                myRef.child("users").child(id).child("Resilience").child("resilience_10").child("resilience_10_14").setValue("Insomnia(not sleeping)");
            }

            Toast.makeText(this, "Information Saved", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Slide_12_Physical.this, Slide_12_Innerthoughts.class );
            startActivity(intent);
        }
    }

}
