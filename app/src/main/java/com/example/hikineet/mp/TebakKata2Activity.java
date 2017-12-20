package com.example.hikineet.mp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TebakKata2Activity extends AppCompatActivity {

    private static final String isPlaying = "Media is Playing";

    private MediaPlayer player;
    Intent intent = getIntent();
    String data;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak_kata2);
        setTitle("Tebak Nama Hewan");

    }

    public void suara(View view)
    {
        playSound(1);
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
            player = MediaPlayer.create(this, R.raw.ayam);
        }
        player.setLooping(false); // Set looping
        player.start();
    }
    public void hewan1(View view){
        int g = 20;
        data = intent.getStringExtra("s");
        int s = Integer.parseInt(data);
        int d = g+s;
        intent = new Intent(this,HasilActivity.class);
        intent.putExtra("g",""+s);
        startActivity(intent);
    }
    public void hewan2(View view){
        intent = new Intent(this,HasilActivity.class);
        startActivity(intent);
    }
    public void hewan3(View view){
        intent = new Intent(this,HasilActivity.class);
        startActivity(intent);
    }
    public void hewan4(View view){
        intent = new Intent(this,HasilActivity.class);
        startActivity(intent);
    }
}
