package com.vinappstudio.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private SeekBar seekBar;
private TextView textView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar = findViewById(R.id.seekBar);
        textView = findViewById(R.id.textView2);
        textView.setText("Energy level : "+seekBar.getProgress() +"/"+seekBar.getMax());


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView.setText("Energy level : "+seekBar.getProgress() +"/"+seekBar.getMax());
                if(seekBar.getProgress()>=7){
                    textView.setTextColor(Color.RED);
                } else{
                    textView.setTextColor(Color.GRAY);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                if(seekBar.getProgress()>=7){
                textView.setTextColor(Color.RED);
                } else{
                    textView.setTextColor(Color.GRAY);
                }
            }
        });

    }
}