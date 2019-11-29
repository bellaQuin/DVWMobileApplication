package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.coachingapp.Issues_Problems.IP_Question_Display_Summary;
import com.example.coachingapp.R;
import com.example.coachingapp.UserDashboard;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class resilience_Screen51 extends AppCompatActivity {

    ImageButton imageIconRight;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;

    EditText editText;
    FirebaseAuth firebaseAuth;
    FirebaseDatabase database;
    DatabaseReference myRef;
    FirebaseUser user;

    String usrID;
    TextView textView_1,textView_1_2,textView_1_3,textView_2,textView_3,textView_4,textView_4_2,textView_4_3, textView_5, textView_6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resilience__screen51);

        editText = findViewById(R.id.question_1_edit_text);

        firebaseAuth = FirebaseAuth.getInstance();
        user = firebaseAuth.getCurrentUser();
        myRef = FirebaseDatabase.getInstance().getReference();
        database = FirebaseDatabase.getInstance();

        textView_1 = (TextView) findViewById(R.id.playback_text_1);
        textView_1_2 = (TextView) findViewById(R.id.playback_text_1_2);
        textView_1_3 = (TextView) findViewById(R.id.playback_text_1_3);
        textView_2 = (TextView) findViewById(R.id.playback_text_2);
        textView_3 = (TextView) findViewById(R.id.playback_text_3);
        textView_4 = (TextView) findViewById(R.id.playback_text_4);
        textView_4_2 = (TextView) findViewById(R.id.playback_text_4_2);
        textView_4_3 = (TextView) findViewById(R.id.playback_text_4_3);
        textView_5 = (TextView) findViewById(R.id.playback_text_5);
        textView_6 = (TextView) findViewById(R.id.playback_text_6);

        firebaseAuth = FirebaseAuth.getInstance();
        Query query = myRef.child("users").child(user.getUid());

        query.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                String ans1 = dataSnapshot.child("Resilience").child("resilience_9").getValue().toString();

                String ans1_2 = dataSnapshot.child("Resilience").child("resilience_10").getValue().toString();

                String ans1_3 = dataSnapshot.child("Resilience").child("resilience_11").getValue().toString();

                String ans_2 = dataSnapshot.child("Resilience").child("resilience_2").getValue().toString();

                String ans_3 = dataSnapshot.child("Resilience").child("resilience_3").getValue().toString();


                String ans_4 = dataSnapshot.child("Resilience").child("resilience_4").getValue().toString();
                String ans_4_2 = dataSnapshot.child("Resilience").child("resilience_5").getValue().toString();
                String ans_4_3 = dataSnapshot.child("Resilience").child("resilience_6").getValue().toString();

                String ans_5 = dataSnapshot.child("Resilience").child("resilience_7").getValue().toString();

                String ans_6 = dataSnapshot.child("Resilience").child("resilience_8").getValue().toString();




                textView_1.setText(ans1);
                textView_1_2.setText(ans1_2);
                textView_1_3.setText(ans1_3);
                textView_2.setText(ans_2);
                textView_3.setText(ans_3);
                textView_4.setText(ans_4);
                textView_4_2.setText(ans_4_2);
                textView_4_3.setText(ans_4_3);
                textView_5.setText(ans_5);
                textView_6.setText(ans_6);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }



    public void btn_home(View view) {
        Intent intent = new Intent(resilience_Screen51.this, UserDashboard.class);
        startActivity(intent);
    }
}
