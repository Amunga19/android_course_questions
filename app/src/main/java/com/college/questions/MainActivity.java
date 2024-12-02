package com.college.questions;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.college.questions.databinding.ActivityMainBinding;

import java.util.Locale;

/*
 TODO: Convert the below code to use View Binding
*/

public class MainActivity extends AppCompatActivity {

    static private final String TAG = "MainActivity";
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Button  addButton  = binding.addButton;
        TextView tvResult = binding.operationResult;
        Button subButton = binding.subButton;
        Button mulButton = binding.mulButton;
        Button divButton = binding.divButton;

        addButton.setOnClickListener( (v) -> {
            EditText operandOne = binding.operandOneEdit;
            EditText operandTwo  = binding.operandTwoEdit;

            String firstNumber = operandOne.getText().toString();
            String secondNumber = operandTwo.getText().toString();
            try {
                Integer numberOne = Integer.valueOf( firstNumber);
                Integer numberTwo = Integer.valueOf(secondNumber);
                int total = numberOne + numberTwo;

                tvResult.setText(String.format(Locale.CANADA, "%d", total));
            } catch (NumberFormatException e) {
                tvResult.setText(R.string.computationError);
            }

        });

        subButton.setOnClickListener(view -> {
            EditText operandOne = binding.operandOneEdit;
            EditText operandTwo  = binding.operandTwoEdit;

            String firstNumber = operandOne.getText().toString();
            String secondNumber = operandTwo.getText().toString();

            try {
                int num1 = Integer.parseInt(firstNumber);
                int num2 = Integer.parseInt(secondNumber);

                int total = num1 - num2;
                tvResult.setText(String.format(Locale.CANADA, "%d", total));
            }catch (NumberFormatException e){
                tvResult.setText(R.string.try_again);
            }
        });

        divButton.setOnClickListener(view -> {
            EditText operandOne = binding.operandOneEdit;
            EditText operandTwo  = binding.operandTwoEdit;

            String firstNumber = operandOne.getText().toString();
            String secondNumber = operandTwo.getText().toString();

            try {
                int num1 = Integer.parseInt(firstNumber);
                int num2 = Integer.parseInt(secondNumber);

                int total = num1 / num2;
                tvResult.setText(String.format(Locale.CANADA, "%d", total));
            }catch (NumberFormatException e){
                tvResult.setText(R.string.no_sir_jaribu_tena_v2);
            }
        });

        mulButton.setOnClickListener(view -> {
            EditText operandOne = binding.operandOneEdit;
            EditText operandTwo  = binding.operandTwoEdit;

            String firstNumber = operandOne.getText().toString();
            String secondNumber = operandTwo.getText().toString();

            try {
                int num1 = Integer.parseInt(firstNumber);
                int num2 = Integer.parseInt(secondNumber);

                int total = num1 * num2;
                tvResult.setText(String.format(Locale.CANADA, "%d", total));
            }catch (NumberFormatException e){
                tvResult.setText(R.string.poor_attempt_keep_trying);
            }
        });
    }


}
