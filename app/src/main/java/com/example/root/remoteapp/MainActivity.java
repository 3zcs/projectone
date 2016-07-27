package com.example.root.remoteapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mPopular_movies ,mStock_hawk , mBuild_it_bigger ,
    mMake_your_app_material , mGo_ubiquitous ,mCapstone ;
    String statment = null , app = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        statment = getString(R.string.this_button);
        app = getString(R.string.app) ;

        mPopular_movies = (Button)findViewById(R.id.popular_movies);
        mStock_hawk = (Button)findViewById(R.id.stock_hawk);
        mBuild_it_bigger = (Button)findViewById(R.id.build_it_bigger);
        mMake_your_app_material = (Button)findViewById(R.id.make_your_app_material);
        mGo_ubiquitous = (Button)findViewById(R.id.go_ubiquitous);
        mCapstone = (Button)findViewById(R.id.capstone);

        mPopular_movies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext() , statment +" "+getString(R.string.popular_movies).toLowerCase()+" "+app
                        , Toast.LENGTH_SHORT).show();
            }
        });

        mStock_hawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext() , statment +" "+getString(R.string.stock_hawk).toLowerCase()+" "+app
                        , Toast.LENGTH_SHORT).show();
            }
        });

        mBuild_it_bigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext() ,statment +" "+getString(R.string.build_it_bigger).toLowerCase()+" "+app
                        , Toast.LENGTH_SHORT).show();
            }
        });

        mMake_your_app_material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext() ,statment +" "+getString(R.string.make_your_app_material).toLowerCase()+" "+app
                        , Toast.LENGTH_SHORT).show();
            }
        });

        mGo_ubiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext() , statment +" "+getString(R.string.go_ubiquitous).toLowerCase()+" "+app
                        , Toast.LENGTH_SHORT).show();
            }
        });

        mCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext() , statment +" "+getString(R.string.capstone).toLowerCase()+" "+app
                        , Toast.LENGTH_SHORT).show();

            }
        });
    }
}
