package com.example.calculatorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText firstNumberText;
    EditText secondNumberText;

    TextView resultView;

    Float firstNumber = 0f;
    Float secondNumber = 0f;
    Float result = 0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumberText = (EditText) findViewById(R.id.firstNumberText);
        secondNumberText = (EditText) findViewById(R.id.secondNumberText);

        resultView = (TextView) findViewById(R.id.resultViewText);

        Button plusButton = findViewById(R.id.plusButton);
        Button minusButton = findViewById(R.id.minusButton);
        Button subtractionButton = findViewById(R.id.subtractionButton);
        Button divisonButton = findViewById(R.id.divisionButton);

        plusButton.setOnClickListener(this);
        minusButton.setOnClickListener(this);
        subtractionButton.setOnClickListener(this);
        divisonButton.setOnClickListener(this);
    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    @Override
    public void onClick(View view) {
        try {
            firstNumber = Float.parseFloat(firstNumberText.getText().toString());
        } catch (NumberFormatException e) {
            System.out.println("Invalid format");
        }

        try {
            secondNumber = Float.parseFloat(secondNumberText.getText().toString());
        } catch (NumberFormatException e) {
            System.out.println("Invalid format");
        }

        switch (view.getId()) {
            case R.id.plusButton:
                result = firstNumber + secondNumber;
                resultView.setText(result.toString());
                break;
            case R.id.minusButton:
                result = firstNumber - secondNumber;
                resultView.setText(result.toString());
                break;
            case R.id.subtractionButton:
                result = firstNumber * secondNumber;
                resultView.setText(result.toString());
                break;
            case R.id.divisionButton:
                result = firstNumber / secondNumber;
                resultView.setText(result.toString());
                break;
        }
    }
}