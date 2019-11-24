package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.coachingapp.Models.Resilience_4;
import com.example.coachingapp.Models.Resilience_5;
import com.example.coachingapp.R;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class resilience_Screen33_1 extends AppCompatActivity {

    FirebaseAuth firebaseAuth;
    FirebaseDatabase database;
    DatabaseReference myRef;
    FirebaseUser user;

    ImageButton imageIconRight;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;
    TextView textView;
    private int buttonState = 1;
    EditText editText1,editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resilience__screen33_1);

        editText1 = findViewById(R.id.resilience_1_edit_text);
        editText2 = findViewById(R.id.resilience_2_edit_text);

        firebaseAuth = FirebaseAuth.getInstance();
        user = firebaseAuth.getCurrentUser();
        myRef = FirebaseDatabase.getInstance().getReference();
        database = FirebaseDatabase.getInstance();
    }


    public void btn_next(View view) {
        if(editText1.getText().toString().equals("") || editText2.getText().toString().equals("")){
            Toast.makeText(resilience_Screen33_1.this, "Please enter something", Toast.LENGTH_LONG).show();
        }
        else {
            addToFirebase();
        }

    }
    private void addToFirebase() {

        String input_6 = editText1.getText().toString().trim();
        String input_7 = editText2.getText().toString().trim();

        if (user != null) {
            Resilience_5 resilience_5 = new Resilience_5(input_6,input_7);
            String id = user.getUid();
            myRef.child("users").child(id).child("Resilience").child("resilience_5").setValue(resilience_5);

            Toast.makeText(this, "Information Saved", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(resilience_Screen33_1.this, resilience_Screen33_2.class);
            startActivity(intent);
        }
    }

    public void btn_back(View view) {
        Intent intent = new Intent(resilience_Screen33_1.this, Slide_17_options.class );
        startActivity(intent);
    }

}
