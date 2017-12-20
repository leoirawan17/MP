package com.example.hikineet.mp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Belajar1Activity extends AppCompatActivity implements View.OnClickListener{


    private static final String isPlaying = "Media is Playing";

    private MediaPlayer player;

    Button lanjut;
    Button kembali;
    Intent intent = getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar1);
        setTitle("Kambing");
        lanjut = findViewById(R.id.lanjut);
        lanjut.setOnClickListener(this);
        kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(this);
    }

    public void onClick(View view){
        if(view == lanjut){
            intent = new Intent(this,Belajar2Activity.class);
            startActivity(intent);
        }

        if(view == kembali){
            intent = new Intent(this,HomeActivity.class);
            startActivity(intent);
        }
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
            player = MediaPlayer.create(this, R.raw.suara_kambing_fix);
        }else if (arg==2){
            player = MediaPlayer.create(this, R.raw.kambing);
        }
        player.setLooping(false); // Set looping
        player.start();

    }



}
