package com.example.get_chat_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b1 = (Button) findViewById(R.id.buttonOk);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Log.e("MainActivity", "Hello world!");
            }
        });



        Button b2 = (Button) findViewById(R.id.btRegistraion);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RegistrationActivity.class));

            }
        });

    }
}