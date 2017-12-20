package com.example.hikineet.mp;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class TebakSuara1Activity extends AppCompatActivity {

    private static final String isPlaying = "Media is Playing";

    private MediaPlayer player;
    Intent intent = getIntent();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak_suara1);
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
            player = MediaPlayer.create(this, R.raw.suara_kambing_fix);
        }
        player.setLooping(false); // Set looping
        player.start();
    }
    public void hewan1(View view){

        new AlertDialog.Builder(this)
                .setTitle("SALAH")
                .setMessage(""+R.drawable.ic_highlight_off_black_24dp)
                .setNeutralButton("OK", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dlg, int sumthin) {
                    }
                })
                .show();
        intent = new Intent(this,TebakKata1Activity.class);
        startActivity(intent);
    }

}
