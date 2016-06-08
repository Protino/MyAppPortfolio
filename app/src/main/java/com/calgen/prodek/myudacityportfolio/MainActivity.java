package com.calgen.prodek.myudacityportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button popularMovies;
    Button buildItBigger;
    Button goUbiquitous;
    Button MakeItMaterial;
    Button capstone;
    Button stockHawk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the button variables
        popularMovies = (Button) findViewById(R.id.popular_movies);
        buildItBigger = (Button) findViewById(R.id.build_it_bigger);
        goUbiquitous = (Button) findViewById(R.id.go_ubiquitous);
        MakeItMaterial = (Button) findViewById(R.id.make_it_material);
        stockHawk = (Button) findViewById(R.id.stock_hawk);
        capstone = (Button) findViewById(R.id.capstone);

        //Now set listeners to each button
        popularMovies.setOnClickListener(this);
        buildItBigger.setOnClickListener(this);
        goUbiquitous.setOnClickListener(this);
        stockHawk.setOnClickListener(this);
        capstone.setOnClickListener(this);
        MakeItMaterial.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int ViewId = v.getId();

        if (v instanceof Button) {

            String toastText = "";

            switch (ViewId) {
                case R.id.popular_movies:
                    toastText = "Want to watch the popular movies?";
                    break;
                case R.id.stock_hawk:
                    toastText = "Let's launch stock hawk app!";
                    break;
                case R.id.build_it_bigger:
                    toastText = "Let's build it BIGGER!";
                    break;
                case R.id.make_it_material:
                    toastText = "Hey material design really looks cool!";
                    break;
                case R.id.go_ubiquitous:
                    toastText = "APP EVERYWHERE!";
                    break;
                case R.id.capstone:
                    toastText = "My final project!";
                    break;
            }
            Toast.makeText(getApplicationContext(), toastText, Toast.LENGTH_SHORT).show();
        }

    }
}
