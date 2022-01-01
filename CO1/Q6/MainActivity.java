package com.example.register_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText textBox,textBox1;
    Button passButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textBox = (EditText)findViewById(R.id.textBox);
        textBox1 = (EditText)findViewById(R.id.textBox1);

        passButton = (Button)findViewById(R.id.passButton);

        passButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = textBox.getText().toString();
                String str2 = textBox1.getText().toString();


                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("message1", str1);
                intent.putExtra("message2", str2);

                startActivity(intent);
            }
        });
    }
}