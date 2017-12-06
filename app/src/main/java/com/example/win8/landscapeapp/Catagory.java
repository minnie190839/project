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

        Button catagory = findViewById(R.id.button_nature);
        catagory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newpage = new Intent(Catagory.this,Nature.class);
                startActivity(newpage);
            }
        });

    }
}
