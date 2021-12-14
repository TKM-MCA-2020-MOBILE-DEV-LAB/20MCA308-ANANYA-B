package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void callSecondActivity(View view){
        Intent i = new Intent(getApplicationContext(), MainActivity2.class);
        i.putExtra("1", "Android Application");
        i.putExtra("2", "Explicit Intent");
        // Set the request code to any code you like, you can identify the
        // callback via this code
        startActivity(i);
    }
}