package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.coachingapp.Models.Resilience_1;
import com.example.coachingapp.Models.Resilience_2;
import com.example.coachingapp.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class resilience_Screen28 extends AppCompatActivity {


    EditText editText;
    FirebaseAuth firebaseAuth;
    FirebaseDatabase database;
    DatabaseReference myRef;
    FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resilience__screen28);

        editText = findViewById(R.id.question_1_edit_text);

        firebaseAuth = FirebaseAuth.getInstance();
        user = firebaseAuth.getCurrentUser();
        myRef = FirebaseDatabase.getInstance().getReference();
        database = FirebaseDatabase.getInstance();
    }

    public void btn_next(View view) {
        if (editText.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(),"Please enter something...", Toast.LENGTH_SHORT).show();
        } else {
            addToFirebase();
        }

    }

    private void addToFirebase() {
        String input_2 = editText.getText().toString().trim();

        if (user != null) {

            Resilience_2 resilience_2 = new Resilience_2(input_2);
            String id = user.getUid();
//            myRef.child("users").child(id).push().setValue(issues);
            myRef.child("users").child(id).child("Resilience").child("resilience_2").setValue(resilience_2);

            Toast.makeText(this, "Information Saved", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(resilience_Screen28.this, resilience_Screen29.class );
            startActivity(intent);

        }
    }

    public void btn_back(View view) {
        Intent intent = new Intent(resilience_Screen28.this, Slide_17_options.class );
        startActivity(intent);
    }
}
