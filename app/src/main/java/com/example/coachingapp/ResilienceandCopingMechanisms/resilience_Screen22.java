package com.example.coachingapp.ResilienceandCopingMechanisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.example.coachingapp.R;

import java.io.IOException;

public class resilience_Screen22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resilience__screen22);
    }


    public void btn_play(View view) {

        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/coachingapp-a95d5.appspot.com/o/guidance%20for%20image%20relaxation.m4a?alt=media&token=81f8aac5-a291-4fde-864f-48b78800d7bf");
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.start();
                }
            });
            mediaPlayer.prepare();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void btn_next(View view) {
        Intent intent = new Intent(resilience_Screen22.this, resilience_Screen23.class );
        startActivity(intent);
    }
    public void btn_back(View view) {
        Intent intent = new Intent(resilience_Screen22.this, Slide_17_options.class );
        startActivity(intent);
    }
}
