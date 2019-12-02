package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.coachingapp.Models.Resilience_1;
import com.example.coachingapp.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Slide_13 extends AppCompatActivity {

    EditText editText;
    FirebaseAuth firebaseAuth;
    FirebaseDatabase database;
    DatabaseReference myRef;
    FirebaseUser user;

    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_13);

        editText = findViewById(R.id.question_1_edit_text);

        firebaseAuth = FirebaseAuth.getInstance();
        user = firebaseAuth.getCurrentUser();
        myRef = FirebaseDatabase.getInstance().getReference();
        database = FirebaseDatabase.getInstance();
    }


    public void btn_next(View view) {
        if (editText.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Please enter something...", Toast.LENGTH_SHORT).show();
        } else {
            addToFirebase();
        }
    }

    private void addToFirebase() {
        String input_1 = editText.getText().toString().trim();


        if (user != null) {

            Resilience_1 resilience_1 = new Resilience_1(input_1);
            String id = user.getUid();

            myRef.child("users").child(id).child("Resilience").child("resilience_1").setValue(resilience_1);

            Toast.makeText(this, "Information Saved", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Slide_13.this, Slide_14.class);
            startActivity(intent);


        }
    }
}
