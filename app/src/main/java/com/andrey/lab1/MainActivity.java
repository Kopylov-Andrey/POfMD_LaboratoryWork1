package com.andrey.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
    implements OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.Button1);

        Button button2 = (Button) findViewById(R.id.Button2);

        Button button3 = (Button) findViewById(R.id.Button3);

        Button button4 = (Button) findViewById(R.id.Button4);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        Button button = (Button) view;
        button.setText(R.string.afterClick);
    }
}