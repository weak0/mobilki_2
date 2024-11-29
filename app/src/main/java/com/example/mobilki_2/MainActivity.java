package com.example.mobilki_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText num1, num2;
    private TextView resultOutput;
    private Button plusBtn, minusBtn, multiply, subtract;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        resultOutput = findViewById(R.id.result);
        plusBtn = findViewById(R.id.plus);
        minusBtn = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        subtract = findViewById(R.id.divide);

        plusBtn.setOnClickListener(view -> OperationSetter(Operations.plus));
        minusBtn.setOnClickListener(view -> OperationSetter(Operations.minus));
        multiply.setOnClickListener(view -> OperationSetter(Operations.multiply));
        subtract.setOnClickListener(view -> OperationSetter(Operations.divide));
    }

    private void OperationSetter(Operations opr) {
        double result = Calc.Count(opr, Double.parseDouble(num1.getText().toString()), Double.parseDouble(num1.getText().toString()));
        resultOutput.setText(String.valueOf(result));
    }

    public void extended(View v) {
        Intent intent = new Intent(MainActivity.this, Calc_Extended.class);
        startActivity(intent);
    }
}

