package com.college.quiz1_question;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_third);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Amunga's Third Activity");
        setSupportActionBar(toolbar);

        toolbar.setLogo(R.drawable.typography);

        ActionBar myBar = getSupportActionBar();
        myBar.setDisplayHomeAsUpEnabled(true);
    }
}
