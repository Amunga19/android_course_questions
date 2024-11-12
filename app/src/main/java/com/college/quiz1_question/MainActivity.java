package com.college.quiz1_question;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.college.quiz1_question.util.MyFileReader;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;

import Quiz1_Question.databinding.ActivityMainBinding;

/*

 This application decodes a JSON file
 and displays the results on a textview.

 The application reads a restaurants JSON file
 and builds a list of restaurants.

 We then display the list of the names of the restaurants
 in the TextView.

 A button is available to clear the TextView and do it again.

 The TODOs below provide step by step instructions
 to complete the implementation.


 Challenge 1:
 Convert the TextView into a ListView and display
 the result accordingly.


 Challenge 2:
 Convert the clear button into a menu item on the Options Menu.
 You can implement it as an Action item with an icon

*/

public class MainActivity extends AppCompatActivity {

    static private final String TAG = "MainActivity";

    ActivityMainBinding binding;

    // Declare a List of restaurants
    ArrayList<Restaurant> listOfRestaurants;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        // When the button is pressed, call readData
        // With the results, populate the textview
        // Put on the TextView the names of the restaurants.
        binding.btnReadJson.setOnClickListener(v -> {
            // Read the file
            listOfRestaurants = readData( "restaurants.json");

            // TODO (4): Extract the restaurants names
            // You can use StringBuilder to build the
            // desired result string:
            //      StringBuilder sb = new StringBuilder();
            // Add an item to a StringBuilder:
            //      sb.append(item.getName());
            // Extract the string:
            //      sb.toString()

            // TODO (5): Display the result on the TextView

        });
    }

    //TODO (6): Clear the output textview
    public void clear(View v) {

    }

    // Deserialize a list of states from a file in JSON format
    public ArrayList<Restaurant> readData(String fileName){

        final ArrayList<Restaurant> mylist = new ArrayList<>();

        try {
            // load the data in an ArrayList
            String jsonString     = MyFileReader.readJson(this, fileName);
            JSONObject json       = new JSONObject(jsonString);
            JSONArray items = json.getJSONArray("restaurants");

            // Loop through the list in the json array

                //TODO (1): Extract the name and description

                //TODO (2) : create a Restaurant object

                //TODO (3): Add the restaurant object to the lisat


        } catch (Exception e) {
            // Log the error
           Log.e(TAG, "Error reading JSON file: " + e.getMessage());
        }
        return mylist;
    }
}