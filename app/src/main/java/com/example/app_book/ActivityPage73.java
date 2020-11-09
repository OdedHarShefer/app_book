package com.example.app_book;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class ActivityPage73 extends AppCompatActivity {

    TextView tv1;
    SeekBar sk1;
    SeekBar sk2;
    SeekBar sk3;

    int x1 = 0;
    int x2 = 0;
    int x3 = 0;
    Random rnd = new Random();
    private SeekBar.OnSeekBarChangeListener sk1Listener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            try {
                x1 = 1 + rnd.nextInt(sk1.getProgress());
            } catch (Exception e) {
                x1 = 0;
            }
            updateTextView();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };
    private SeekBar.OnSeekBarChangeListener sk2Listener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            try {
                x2 = 1 + rnd.nextInt(sk2.getProgress());
            } catch (Exception e) {
                x2 = 0;
            }
            updateTextView();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };
    private SeekBar.OnSeekBarChangeListener sk3Listener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            try {
                x3 = 1 + rnd.nextInt(sk3.getProgress());
            } catch (Exception e) {
                x3 = 0;
            }
            updateTextView();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page73);

        tv1 = findViewById(R.id.textView2);

        sk1 = findViewById(R.id.seekBar1);
        sk1.setOnSeekBarChangeListener(sk1Listener);

        sk2 = findViewById(R.id.seekBar2);
        sk2.setOnSeekBarChangeListener(sk2Listener);

        sk3 = findViewById(R.id.seekBar3);
        sk3.setOnSeekBarChangeListener(sk3Listener);

        x1 = 1 + rnd.nextInt(sk1.getProgress());
        x2 = 1 + rnd.nextInt(sk2.getProgress());
        x3 = 1 + rnd.nextInt(sk3.getProgress());
        updateTextView();
    }

    private void updateTextView() {
        int r = x1 + x2 + x3;
        tv1.setText(r + "");
    }
}