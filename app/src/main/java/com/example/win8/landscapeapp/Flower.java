package com.example.win8.landscapeapp;

import android.app.AlertDialog;
import android.app.WallpaperManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.win8.landscapeapp.DB.DBList;

import java.io.IOException;
import java.util.ArrayList;


public class Flower extends AppCompatActivity {
    private ArrayList<PictureItem> mPictureItemList ;
    public Button savepic;
    public ImageView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower);

        savepic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WallpaperManager wallmgr = WallpaperManager.getInstance(getApplicationContext());
                try {
                    wallmgr.setResource(+R.drawable.flower_one);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast myToast = Toast.makeText(getApplicationContext(), "save as a background.", Toast.LENGTH_SHORT);
                myToast.setGravity(Gravity.CENTER, 0, 0);
                myToast.show(); //เป็นการทำงานของ Toast ให้มีกล่องข้อความขึ้นว่า save as a background เมื่อเรากดปุ่ม Savepicture ให้โชว์ในเวลาสั้น ๆ
            }
        });
        savepic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WallpaperManager wallmgr = WallpaperManager.getInstance(getApplicationContext());
                try {
                    wallmgr.setResource(+R.drawable.flower_three);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast myToast = Toast.makeText(getApplicationContext(), "save as a background.", Toast.LENGTH_SHORT);
                myToast.setGravity(Gravity.CENTER, 0, 0);
                myToast.show(); //เป็นการทำงานของ Toast ให้มีกล่องข้อความขึ้นว่า save as a background เมื่อเรากดปุ่ม Savepicture ให้โชว์ในเวลาสั้น ๆ
            }

        });
        savepic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WallpaperManager wallmgr = WallpaperManager.getInstance(getApplicationContext());
                try {
                    wallmgr.setResource(+R.drawable.flower_four);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast myToast = Toast.makeText(getApplicationContext(), "save as a background.", Toast.LENGTH_SHORT);
                myToast.setGravity(Gravity.CENTER, 0, 0);
                myToast.show(); //เป็นการทำงานของ Toast ให้มีกล่องข้อความขึ้นว่า save as a background เมื่อเรากดปุ่ม Savepicture ให้โชว์ในเวลาสั้น ๆ
            }

        });
        savepic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WallpaperManager wallmgr = WallpaperManager.getInstance(getApplicationContext());
                try {
                    wallmgr.setResource(+R.drawable.flower_five);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast myToast = Toast.makeText(getApplicationContext(), "save as a background.", Toast.LENGTH_SHORT);
                myToast.setGravity(Gravity.CENTER, 0, 0);
                myToast.show(); //เป็นการทำงานของ Toast ให้มีกล่องข้อความขึ้นว่า save as a background เมื่อเรากดปุ่ม Savepicture ให้โชว์ในเวลาสั้น ๆ
            }

        });
        savepic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WallpaperManager wallmgr = WallpaperManager.getInstance(getApplicationContext());
                try {
                    wallmgr.setResource(+R.drawable.flower_six);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast myToast = Toast.makeText(getApplicationContext(), "save as a background.", Toast.LENGTH_SHORT);
                myToast.setGravity(Gravity.CENTER, 0, 0);
                myToast.show(); //เป็นการทำงานของ Toast ให้มีกล่องข้อความขึ้นว่า save as a background เมื่อเรากดปุ่ม Savepicture ให้โชว์ในเวลาสั้น ๆ
            }

        });


    }

}


