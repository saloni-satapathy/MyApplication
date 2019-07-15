package com.example.android.myapplication;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tutorialspoint7.myapplication.R;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    ImageButton b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("http://www.testcover.com"));
                startActivity(i);
            }
        });

        b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("com.example.tutorialspoint7.myapplication.LAUNCH",
                        Uri.parse("http://www.testcover.com"));
                startActivity(i);
            }
        });

        b3 = (Button)findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("com.example.My Application.LAUNCH",
                        Uri.parse("https://www.example.com"));
                startActivity(i);
            }
        });

        b4=(Button)findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("tel:9510300000"));
                startActivity(i);
            }
        });

        b5=(ImageButton)findViewById(R.id.imageButton);
        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("http://www.testcover.com"));
                startActivity(i);
            }
        });

    }
}