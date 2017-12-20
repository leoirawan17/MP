package com.example.hikineet.mp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Belajar2Activity extends AppCompatActivity {


    private static final String isPlaying = "Media is Playing";

    private MediaPlayer player;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar2);
    }

    public void suaraHewan(View view)
    {
        playSound(1);
    }
    public void suaraKata(View view){
        playSound(2);
    }

    public void onPause() {
        try{
            super.onPause();
            player.pause();
        }catch (Exception e){
        }
    }
    private void playSound(int arg){
        try{
            if (player.isPlaying()) {
                player.stop();
                player.release();
            }
        }catch(Exception e){
        }
        if (arg == 1){
            player = MediaPlayer.create(this, R.raw.suara_ayam_fix);
        }else if (arg==2){
            player = MediaPlayer.create(this, R.raw.ayam);
        }
        player.setLooping(false); // Set looping
        player.start();

    }


}
