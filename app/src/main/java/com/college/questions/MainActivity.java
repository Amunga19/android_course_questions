package com.college.questions;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/*
 TODO:
 Implement the DIV, SUB, MUL, and DIV operations

 */
public class MainActivity extends AppCompatActivity {

    static private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText value1 = findViewById(R.id.edit_text_1);
        EditText value2 = findViewById(R.id.edit_text_2);

        TextView resultBox = findViewById(R.id.operation_result);
        Button addBtn = findViewById(R.id.add_button);
        Button subBtn = findViewById(R.id.sub_button);
        Button mulBtn = findViewById(R.id.mul_button);
        Button divBtn = findViewById(R.id.div_button);

        /* Getting the strings inputted
        String string1 = value1.getText().toString();
        String string2 = value2.getText().toString();

        //Turn the strings to doubles for arithmetic calculations
        Double num1 = Double.parseDouble(string1);
        Double num2 = Double.parseDouble(string2); */


        addBtn.setOnClickListener(view -> {
            // Getting the strings inputted
            String string1 = value1.getText().toString();
            String string2 = value2.getText().toString();

            //Turn the strings to doubles for arithmetic calculations
            Double num1 = Double.parseDouble(string1);
            Double num2 = Double.parseDouble(string2);
            //Add
            Double result = num1 + num2;

            //Pass it to the result box as string
            resultBox.setText(String.valueOf(result));

            Toast.makeText(this, R.string.congratulations_you_have_added_correctly,
                    Toast.LENGTH_LONG).show();

        });

        subBtn.setOnClickListener(view -> {
            // Getting the strings inputted
            String string1 = value1.getText().toString();
            String string2 = value2.getText().toString();

            //Turn the strings to doubles for arithmetic calculations
            Double num1 = Double.parseDouble(string1);
            Double num2 = Double.parseDouble(string2);

            //Subtract
            Double result = num1 - num2;

            //Display the results
            resultBox.setText(String.valueOf(result));

            Toast.makeText(this, R.string.what_a_subtraction_genius,
                    Toast.LENGTH_LONG).show();
        });

        divBtn.setOnClickListener(view -> {
            // Getting the strings inputted
            String string1 = value1.getText().toString();
            String string2 = value2.getText().toString();

            //Turn the strings to doubles for arithmetic calculations
            Double num1 = Double.parseDouble(string1);
            Double num2 = Double.parseDouble(string2);

            // Divide
            Double result = num1 / num2;

            resultBox.setText(String.valueOf(result));

            Toast.makeText(this, R.string.great_score_divide_and_conquer,
                    Toast.LENGTH_LONG).show();
        });

        mulBtn.setOnClickListener(view -> {
            // Getting the strings inputted
            String string1 = value1.getText().toString();
            String string2 = value2.getText().toString();

            //Turn the strings to doubles for arithmetic calculations
            Double num1 = Double.parseDouble(string1);
            Double num2 = Double.parseDouble(string2);

            // Multiply
            Double result = num1 * num2;

            resultBox.setText(String.valueOf(result));

            Toast.makeText(this, R.string.great_multiplication_successful,
                    Toast.LENGTH_LONG).show();
        });




    }


}
