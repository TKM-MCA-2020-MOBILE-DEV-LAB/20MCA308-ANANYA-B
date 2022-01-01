package com.example.register_intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView text1,text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text1 = (TextView)findViewById(R.id.text1);


        Intent intent = getIntent();
        String str1 = intent.getStringExtra("message1");
        String str2 = intent.getStringExtra("message2");
        text1.setText("Your Username: "+str1 + "\n" +"Your Mail_id: "+ str2);


    }
}