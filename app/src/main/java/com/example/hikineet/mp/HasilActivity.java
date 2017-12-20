package com.example.hikineet.mp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    TextView hasil;
    String tampil,h1,h2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        hasil = findViewById(R.id.hasil);
        Intent intent = getIntent();
        //h1 = intent.getStringExtra("s");
        h2 = intent.getStringExtra("g");
        //int n1 = Integer.parseInt(h1);
        //int n2 = Integer.parseInt(h2);
        //int hasilA = n1 + n2;
        //tampil = Integer.toString(hasilA);
        hasil.setText(h2);
    }
}
