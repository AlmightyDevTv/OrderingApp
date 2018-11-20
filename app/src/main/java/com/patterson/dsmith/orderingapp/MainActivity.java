package com.patterson.dsmith.orderingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button softDrinks;
    Button Hamburger;
    TextView Almightyskitchen;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Almightyskitchen = (TextView) findViewById(R.id.storename);
        Hamburger = (Button) findViewById(R.id.buttonf1);
        softDrinks = (Button) findViewById(R.id.buttond2);


        Hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"typeofburger", Toast.LENGTH_SHORT).show();
            }
        });

        softDrinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"typeofdrink",Toast.LENGTH_SHORT).show();

            }
        });

    }
}
