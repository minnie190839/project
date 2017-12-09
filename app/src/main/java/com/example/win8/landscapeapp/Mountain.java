package com.example.win8.landscapeapp;

import android.app.WallpaperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class Mountain extends AppCompatActivity {
    Button save;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain);

        save = (Button) findViewById(R.id.save);
        img =(ImageView) findViewById(R.id.img);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WallpaperManager wallmgr = WallpaperManager.getInstance(getApplicationContext());
                try {
                    wallmgr.setResource(+ R.drawable.moun_one);
                }
                catch (IOException e){
                    e.printStackTrace();
                }
                Toast myToast = Toast.makeText(getApplicationContext(),"save as a background.",Toast.LENGTH_SHORT);
                myToast.setGravity(Gravity.CENTER,0,0);
                myToast.show(); //เป็นการทำงานของ Toast ให้มีกล่องข้อความขึ้นว่า save as a background เมื่อเรากดปุ่ม Savepicture ให้โชว์ในเวลาสั้น ๆ
            }

        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WallpaperManager wallmgr = WallpaperManager.getInstance(getApplicationContext());
                try {
                    wallmgr.setResource(+ R.drawable.moun_two);
                }
                catch (IOException e){
                    e.printStackTrace();
                }
                Toast myToast = Toast.makeText(getApplicationContext(),"save as a background.",Toast.LENGTH_SHORT);
                myToast.setGravity(Gravity.CENTER,0,0);
                myToast.show(); //เป็นการทำงานของ Toast ให้มีกล่องข้อความขึ้นว่า save as a background เมื่อเรากดปุ่ม Savepicture ให้โชว์ในเวลาสั้น ๆ
            }

        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WallpaperManager wallmgr = WallpaperManager.getInstance(getApplicationContext());
                try {
                    wallmgr.setResource(+ R.drawable.moun_three);
                }
                catch (IOException e){
                    e.printStackTrace();
                }
                Toast myToast = Toast.makeText(getApplicationContext(),"save as a background.",Toast.LENGTH_SHORT);
                myToast.setGravity(Gravity.CENTER,0,0);
                myToast.show(); //เป็นการทำงานของ Toast ให้มีกล่องข้อความขึ้นว่า save as a background เมื่อเรากดปุ่ม Savepicture ให้โชว์ในเวลาสั้น ๆ
            }

        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WallpaperManager wallmgr = WallpaperManager.getInstance(getApplicationContext());
                try {
                    wallmgr.setResource(+ R.drawable.moun_four);
                }
                catch (IOException e){
                    e.printStackTrace();
                }
                Toast myToast = Toast.makeText(getApplicationContext(),"save as a background.",Toast.LENGTH_SHORT);
                myToast.setGravity(Gravity.CENTER,0,0);
                myToast.show(); //เป็นการทำงานของ Toast ให้มีกล่องข้อความขึ้นว่า save as a background เมื่อเรากดปุ่ม Savepicture ให้โชว์ในเวลาสั้น ๆ
            }

        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WallpaperManager wallmgr = WallpaperManager.getInstance(getApplicationContext());
                try {
                    wallmgr.setResource(+ R.drawable.moun_five);
                }
                catch (IOException e){
                    e.printStackTrace();
                }
                Toast myToast = Toast.makeText(getApplicationContext(),"save as a background.",Toast.LENGTH_SHORT);
                myToast.setGravity(Gravity.CENTER,0,0);
                myToast.show(); //เป็นการทำงานของ Toast ให้มีกล่องข้อความขึ้นว่า save as a background เมื่อเรากดปุ่ม Savepicture ให้โชว์ในเวลาสั้น ๆ
            }

        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WallpaperManager wallmgr = WallpaperManager.getInstance(getApplicationContext());
                try {
                    wallmgr.setResource(+ R.drawable.moun_six);
                }
                catch (IOException e){
                    e.printStackTrace();
                }
                Toast myToast = Toast.makeText(getApplicationContext(),"save as a background.",Toast.LENGTH_SHORT);
                myToast.setGravity(Gravity.CENTER,0,0);
                myToast.show(); //เป็นการทำงานของ Toast ให้มีกล่องข้อความขึ้นว่า save as a background เมื่อเรากดปุ่ม Savepicture ให้โชว์ในเวลาสั้น ๆ
            }

        });
    }
}
