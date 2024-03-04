package com.example.laba4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button TrueButton;
Button FalseButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TrueButton = (Button) findViewById(R.id.TrueButton);
        FalseButton = (Button) findViewById(R.id.FalseButton);
        Intent intenttrue = new Intent(this, MainActivityTrue.class);
        Intent intentfalse = new Intent(this, MainActivityFalse.class);
        TrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intenttrue);

            }
        });
        FalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentfalse);
            }
        });
    }
}