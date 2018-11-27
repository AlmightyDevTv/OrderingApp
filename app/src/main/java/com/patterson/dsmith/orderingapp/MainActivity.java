package com.patterson.dsmith.orderingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button softDrinks;
    Button Hamburger;
    TextView Almightyskitchen;
    RadioButton BaconBurger;
    RadioButton ShrimpBurger;
    RadioButton   AlmightyBurger;
    RadioButton   pickle;
    RadioButton   tomato;
    RadioButton   whitecheese;
    RadioButton   Americancheese;
    RadioButton  SpriTea;
    RadioButton Strawberrygingerale;
    RadioButton cranberrycoke;
    RadioButton  Small;
    RadioButton Medium;
    RadioButton Large;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Almightyskitchen = (TextView) findViewById(R.id.storename);
        Hamburger = (Button) findViewById(R.id.buttonft1);
        softDrinks = (Button) findViewById(R.id.buttond2);
        BaconBurger = (RadioButton) findViewById(R.id.buttonft2);
        ShrimpBurger = (RadioButton) findViewById(R.id.buttonft3);
        AlmightyBurger = (RadioButton) findViewById(R.id.buttonft4);
        pickle = (RadioButton) findViewById(R.id.buttonft5);
        tomato = (RadioButton) findViewById(R.id.buttonft6);
        whitecheese = (RadioButton) findViewById(R.id.buttonft7);
        Americancheese = (RadioButton) findViewById(R.id.buttonft8);
        SpriTea = (RadioButton) findViewById(R.id.buttond6);
        Strawberrygingerale = (RadioButton) findViewById(R.id.buttond7);
        cranberrycoke = (RadioButton) findViewById(R.id.buttond8);
        SpriTea = (RadioButton) findViewById(R.id.buttond6);
        Strawberrygingerale = (RadioButton) findViewById(R.id.buttond7);
        cranberrycoke = (RadioButton) findViewById(R.id.buttond8);
        Small = (RadioButton) findViewById(R.id.buttond9);
        Medium = (RadioButton) findViewById(R.id.buttond10);
        Large = (RadioButton) findViewById(R.id.buttond11);

       Hamburger.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               BaconBurger.setVisibility(View.VISIBLE);
               ShrimpBurger.setVisibility(View.VISIBLE);
               AlmightyBurger.setVisibility(View.VISIBLE);
               pickle.setVisibility(View.VISIBLE);
               tomato.setVisibility(View.VISIBLE);
               whitecheese.setVisibility(View.VISIBLE);
               Americancheese.setVisibility(View.VISIBLE);
               SpriTea.setVisibility(View.INVISIBLE);
               Strawberrygingerale.setVisibility(View.INVISIBLE);
               cranberrycoke.setVisibility(View.INVISIBLE);
               Small.setVisibility(View.INVISIBLE);
               Medium.setVisibility(View.INVISIBLE);
               Large.setVisibility(View.INVISIBLE);
           }
       });

        softDrinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SpriTea.setVisibility(View.VISIBLE);
                Strawberrygingerale.setVisibility(View.VISIBLE);
                cranberrycoke.setVisibility(View.VISIBLE);
                Small.setVisibility(View.VISIBLE);
                Medium.setVisibility(View.VISIBLE);
                Large.setVisibility(View.VISIBLE);
                BaconBurger.setVisibility(View.INVISIBLE);
                ShrimpBurger.setVisibility(View.INVISIBLE);
                AlmightyBurger.setVisibility(View.INVISIBLE);
                pickle.setVisibility(View.INVISIBLE);
                tomato.setVisibility(View.INVISIBLE);
                whitecheese.setVisibility(View.INVISIBLE);
                Americancheese.setVisibility(View.INVISIBLE);


            }
        });

    }
}
