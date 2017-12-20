package com.example.hikineet.mp;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TebakKata1Activity extends AppCompatActivity {

    private static final String isPlaying = "Media is Playing";

    private MediaPlayer player;
    Intent intent = getIntent();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak_kata1);
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
            player = MediaPlayer.create(this, R.raw.kambing);
        }
        player.setLooping(false); // Set looping
        player.start();
    }
    public void hewan1(View view){
        intent = new Intent(this,TebakKata2Activity.class);
        startActivity(intent);
    }
    public void hewan2(View view){
        int s = 20;
        intent = new Intent(this,TebakKata2Activity.class);
        intent.putExtra("s",""+s);
        startActivity(intent);
    }
    public void hewan3(View view){
        intent = new Intent(this,TebakKata2Activity.class);
        startActivity(intent);
    }
    public void hewanEmpat(View view){
        intent = new Intent(this,TebakKata2Activity.class);
        startActivity(intent);
    }

}
