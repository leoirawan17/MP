package com.example.hikineet.mp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    Intent intent = getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void mulaiPembelajaran(View view){
        intent = new Intent(this,Belajar1Activity.class);
        startActivity(intent);
    }
    public void tebaknamahewan(View view){
        intent = new Intent(this,TebakKata1Activity.class);
        startActivity(intent);
    }
}
