package com.project.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText firstNum, secondNum;
    private Button add, subtract, multiply, divide, clear;
    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNum = findViewById(R.id.etFirst);
        secondNum = findViewById(R.id.etSecond);
        add = findViewById(R.id.btnAdd);
        subtract = findViewById(R.id.btnSubtract);
        multiply = findViewById(R.id.btnMultiply);
        divide = findViewById(R.id.btnDivide);
        clear = findViewById(R.id.btnClear);
        display = findViewById(R.id.tvDisplay);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstNum.getText().toString().length()==0)
                {
                    firstNum.setText("0");
                }
                if (secondNum.getText().toString().length()==0)
                {
                    secondNum.setText("0");
                }
                Float a = Float.valueOf(firstNum.getText().toString());
                Float b = Float.valueOf(secondNum.getText().toString());

                Float add_result= (a+b);
                display.setText(String.valueOf(add_result));
                Toast.makeText(MainActivity.this, "Added Successfully.", Toast.LENGTH_SHORT).show();
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstNum.getText().toString().length()==0)
                {
                    firstNum.setText("0");
                }
                if (secondNum.getText().toString().length()==0)
                {
                    secondNum.setText("0");
                }
                Float a = Float.valueOf(firstNum.getText().toString());
                Float b = Float.valueOf(secondNum.getText().toString());

                Float sub_result= (a-b);
                display.setText(String.valueOf(sub_result));
                Toast.makeText(MainActivity.this, "Subtracted Successfully.", Toast.LENGTH_SHORT).show();

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstNum.getText().toString().length()==0)
                {
                    firstNum.setText("0");
                }
                if (secondNum.getText().toString().length()==0)
                {
                    secondNum.setText("0");
                }
                Float a = Float.valueOf(firstNum.getText().toString());
                Float b = Float.valueOf(secondNum.getText().toString());

                Float mul_result= (a*b);
                display.setText(String.valueOf(mul_result));
                Toast.makeText(MainActivity.this, "Multiplied Successfully.", Toast.LENGTH_SHORT).show();
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstNum.getText().toString().length()==0)
                {
                    firstNum.setText("0");
                }
                if (secondNum.getText().toString().length()==0)
                {
                    secondNum.setText("0");
                }
                Float a = Float.valueOf(firstNum.getText().toString());
                Float b = Float.valueOf(secondNum.getText().toString());

                Float div_result= (a/b);
                display.setText(String.valueOf(div_result));
                Toast.makeText(MainActivity.this, "Divided Successfully.", Toast.LENGTH_SHORT).show();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNum.setText("");
                secondNum.setText("");
                display.setText("");
                Toast.makeText(MainActivity.this, "Cleared Successfully.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}