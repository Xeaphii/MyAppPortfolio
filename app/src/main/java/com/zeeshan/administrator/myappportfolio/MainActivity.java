package com.zeeshan.administrator.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button Initializations
        // Boast was not developed by me, but was taken from online open source project part

        Log.e(MainActivity.class.getSimpleName(), "This is for testing purpose");

        Button btn_pop_movies = (Button) findViewById(R.id.btn_pop_movies);
        Button btn_stock_hawk = (Button) findViewById(R.id.btn_stock_hawk);
        Button btn_build_it_bigger = (Button) findViewById(R.id.btn_build_it_bigger);
        Button btn_make_your_app_material = (Button) findViewById(R.id.btn_make_your_app_material);
        Button btn_go_ubiquitous = (Button) findViewById(R.id.btn_go_ubiquitous);
        Button btn_capstone = (Button) findViewById(R.id.btn_capstone);

        //now buttons onclick listeners proceed.
        btn_pop_movies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boast.showText(getApplicationContext(), R.string.pop_movies_project,
                        Toast.LENGTH_LONG);

            }
        });

        btn_stock_hawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boast.showText(getApplicationContext(), R.string.stock_hawk_project,
                        Toast.LENGTH_LONG);

            }
        });

        btn_build_it_bigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boast.showText(getApplicationContext(), R.string.build_it_bigger_project,
                        Toast.LENGTH_LONG);
            }
        });

        btn_make_your_app_material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boast.showText(getApplicationContext(), R.string.build_it_bigger_project,
                        Toast.LENGTH_LONG);
            }
        });

        btn_go_ubiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boast.showText(getApplicationContext(), R.string.go_ubiqitous_project,
                        Toast.LENGTH_LONG);
            }
        });

        btn_capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boast.showText(getApplicationContext(), R.string.capstone_project,
                        Toast.LENGTH_LONG);
            }
        });


    }
}
