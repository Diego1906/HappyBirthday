package com.example.android.happybirthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // private String texto = "\nSua linda!!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        TextView txt = findViewById(R.id.txt_happy_birthday);
        txt.setText(txt.getText() + texto);
        */
    }
}
