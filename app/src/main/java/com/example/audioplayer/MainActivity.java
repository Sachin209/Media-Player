package com.example.audioplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer audioplayer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void play(View view) {
        if (audioplayer == null){
            audioplayer = MediaPlayer.create(getApplicationContext(), R.raw.www);
            audioplayer.start();

        }else{
            audioplayer.start();
        }
    }

    public void pause(View view){
        if (audioplayer != null){
            audioplayer.pause();
        }
    }

    public void stop(View view){
        audioplayer.release();
        audioplayer=null;
    }
}