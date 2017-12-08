package com.example.win8.landscapeapp;

import android.app.WallpaperManager;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.win8.landscapeapp.DB.DBList;

import java.io.IOException;

import com.example.win8.landscapeapp.DB.DBList;

public class Flower extends AppCompatActivity {

    private DBList mHelper;
    private SQLiteDatabase mDb;
    Button save;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower);

        save = (Button)findViewById(R.id.save);
        img = (ImageView)findViewById(R.id.img);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WallpaperManager wallmgr = WallpaperManager.getInstance(getApplicationContext());
                try {
                    wallmgr.setResource(+ R.drawable.flower_one);

                } catch (IOException e) {
                    e.printStackTrace();
                }
                //เป็นปุ่มคลิก เมื่อเวลาคลิกเราจะบันทึกรุปภาพที่เราต้องการทำให้เป็น ภาพพื้นหลังในหน้าจอโทรศัพท์ของเรา (เอารุปภาพที่ต้องการทำเป็นภาพพื้นหลังหน้าจอ)

                Toast myToast = Toast.makeText(getApplicationContext(),"save as a background.",Toast.LENGTH_SHORT);
                myToast.setGravity(Gravity.CENTER,0,0);
                myToast.show(); //เป็นการทำงานของ Toast ให้มีกล่องข้อความขึ้นว่า save as a background เมื่อเรากดปุ่ม Savepicture ให้โชว์ในเวลาสั้น ๆ

            }
        });

    }
}

