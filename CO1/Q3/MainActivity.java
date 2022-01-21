

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText number1;
    private EditText number2;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        textView = (TextView) findViewById(R.id.textView);
        // Addition
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((number1.getText().length() > 0) && (number2.getText().length() > 0)) {
                    double oper1 = Double.parseDouble(number1.getText().toString());
                    double oper2 = Double.parseDouble(number2.getText().toString());
                    double result = oper1 + oper2;
                    textView.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Enter The Required Numbers", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        //Subtraction
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((number1.getText().length() > 0) && (number2.getText().length() > 0)) {
                    double oper1 = Double.parseDouble(number1.getText().toString());
                    double oper2 = Double.parseDouble(number2.getText().toString());
                    double result = oper1 - oper2;
                    textView.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Enter The Required Numbers", Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });
        // Multiplication
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((number1.getText().length() > 0) && (number2.getText().length() > 0)) {
                    double oper1 = Double.parseDouble(number1.getText().toString());
                    double oper2 = Double.parseDouble(number2.getText().toString());
                    double result = oper1 * oper2;
                    textView.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Enter The Required Numbers", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        // Division
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((number1.getText().length() > 0) && (number2.getText().length() > 0)) {
                    double oper1 = Double.parseDouble(number1.getText().toString());
                    double oper2 = Double.parseDouble(number2.getText().toString());
                    double result = oper1 / oper2;
                    textView.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Enter The Required Numbers", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }
}