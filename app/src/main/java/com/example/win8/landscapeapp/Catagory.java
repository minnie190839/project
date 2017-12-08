package com.example.win8.landscapeapp;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.win8.landscapeapp.DB.DBList;

public class Catagory extends AppCompatActivity {

    private DBList mHelper;
    private SQLiteDatabase mDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagory);

        Button nature = findViewById(R.id.button_nature);
        nature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newpage = new Intent(Catagory.this,ListViewNature.class);
                startActivity(newpage);
            }
        });

        Button build = findViewById(R.id.button_building);
        build.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newpage = new Intent(Catagory.this,ListViewBuild.class);
                startActivity(newpage);
            }
        });

        Button flower = findViewById(R.id.button_flower);
        flower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newpage = new Intent(Catagory.this,ListViewFlower.class);
                startActivity(newpage);
            }
        });

        Button mountain = findViewById(R.id.button_mountain);
        mountain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newpage = new Intent(Catagory.this,ListViewMountain.class);
                startActivity(newpage);
            }
        });

        Button sky = findViewById(R.id.button_sky);
        sky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newpage = new Intent(Catagory.this,ListViewSky.class);
                startActivity(newpage);
            }
        });

        Button sunset = findViewById(R.id.button_sunset);
        sunset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newpage = new Intent(Catagory.this,ListViewSunset.class);
                startActivity(newpage);
            }
        });
    }
}
