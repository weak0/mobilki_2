package com.example.mobilki_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calc_Extended extends AppCompatActivity {
    private EditText num1, num2;
    private TextView resultOutput;
    Button plusBtn, minusBtn, multiplyBtn, subtractBtn, powBtn, sqrtBtn, silniaBtn, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rozszerzony_kalkulator);


        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        plusBtn = findViewById(R.id.plus);
        minusBtn = findViewById(R.id.minus);
        multiplyBtn = findViewById(R.id.multiply);
        subtractBtn = findViewById(R.id.divide);
        sqrtBtn = findViewById(R.id.sqrt);
        powBtn = findViewById(R.id.pow);
        silniaBtn = findViewById(R.id.silnia);
        back = findViewById(R.id.back);
        resultOutput = findViewById(R.id.result);

        plusBtn.setOnClickListener(v -> SetResult(Operations.plus));
        minusBtn.setOnClickListener(v -> SetResult(Operations.minus));
        multiplyBtn.setOnClickListener(v -> SetResult(Operations.multiply));
        subtractBtn.setOnClickListener(v -> SetResult(Operations.divide));
        sqrtBtn.setOnClickListener(v -> SetResult(Operations.sqrt));
        powBtn.setOnClickListener(v -> SetResult(Operations.pow));
        silniaBtn.setOnClickListener(v -> SetResult(Operations.silnia));
    }

    private void SetResult(Operations opr) {
        double result = Calc.Count(opr, Double.parseDouble(num1.getText().toString()), Double.parseDouble(num2.getText().toString()));
        resultOutput.setText(String.valueOf(result));
    }


    public void back(View v)  {
        Intent intent = new Intent(Calc_Extended.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}

