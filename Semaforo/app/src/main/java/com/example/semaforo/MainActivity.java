package com.example.semaforo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    MediaPlayer note1, note2, note3, note4, note5, note6, note7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btnNota1);
        btn2 = findViewById(R.id.btnNota2);
        btn3 = findViewById(R.id.btnNota3);
        btn4 = findViewById(R.id.btnNota4);
        btn5 = findViewById(R.id.btnNota5);
        btn6 = findViewById(R.id.btnNota6);
        btn7 = findViewById(R.id.btnNota7);

        note1 = MediaPlayer.create(getApplicationContext(), R.raw.note1);
        note2 = MediaPlayer.create(getApplicationContext(), R.raw.note2);
        note3 = MediaPlayer.create(getApplicationContext(), R.raw.note3);
        note4 = MediaPlayer.create(getApplicationContext(), R.raw.note4);
        note5 = MediaPlayer.create(getApplicationContext(), R.raw.note5);
        note6 = MediaPlayer.create(getApplicationContext(), R.raw.note6);
        note7 = MediaPlayer.create(getApplicationContext(), R.raw.note7);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnNota1:
                note1.start();
                break;

            case R.id.btnNota2:
                note2.start();
                break;

            case R.id.btnNota3:
                note3.start();
                break;

            case R.id.btnNota4:
                note4.start();
                break;

            case R.id.btnNota5:
                note5.start();
                break;
            case R.id.btnNota6:
                note6.start();
                break;

            case R.id.btnNota7:
                note7.start();
                break;
            default:
                break;
        }
    }
}