package com.example.dima.testingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvTest = (TextView) findViewById(R.id.tvTest);

        tvTest.setText("Hello Dima !!!");

        EditText edName = (EditText) findViewById(R.id.edName);

        edName.setText("Hi");
    }
}
