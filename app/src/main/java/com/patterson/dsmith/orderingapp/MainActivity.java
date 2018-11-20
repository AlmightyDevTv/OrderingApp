package com.patterson.dsmith.orderingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button softDrinks;
    Button Hamburger;
    TextView Almightyskitchen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Almightyskitchen = (TextView) findViewById(R.id.Almightyskithchen);
        Hamburger = (Button) findViewById(R.id.button1);
        softDrinks = (Button) findViewById(R.id.button2);




    }
}
