package com.example.win8.landscapeapp.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.win8.landscapeapp.R;

/**
 * Created by Win8 on 6/12/2560.
 */

public class DBList extends SQLiteOpenHelper{

    private static final String DATABASE_NAME ="image.db";
    private static final int DATABASE_VERSION = 8;

    public static final String COL_TYPE = "type";
    public static final String COL_PICTURE = "picture";
    public static final String TABLE_NAME ="pic_image";
    public static final String COL_ID = "_id";

    //การตั้งค่าเริ่มต้นให้กับฐานข้อมูล(DB)

    private static final String CREATE_TABLE = "CREATE TABLE "
            + TABLE_NAME + "("
            + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COL_TYPE + " TEXT, "
            + COL_PICTURE + " INTEGER)"; //เก็บไฟล์ภาพที่ drawable เลยต้องเก็บค่าให้เป็น integer
    //สร้างตารางขึ้นมา โดยกำหนดให้ id เป็น primary key

    public DBList(Context context) {

        super(context, DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE); // สร้างฐานข้อมูล database
        insertInitialData(db); // เรียกใช้ method พร้อมส่งค่า db ไปเรียกใช้
    }

    private void insertInitialData(SQLiteDatabase db) {
        ContentValues cv = new ContentValues();
        cv.put(COL_TYPE, "NATURE");
        cv.put(COL_PICTURE, R.drawable.nature_one);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "NATURE");
        cv.put(COL_PICTURE, R.drawable.nature_two);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "NATURE");
        cv.put(COL_PICTURE, R.drawable.nature_three);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "NATURE");
        cv.put(COL_PICTURE, R.drawable.nature_four);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "NATURE");
        cv.put(COL_PICTURE, R.drawable.nature_five);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "NATURE");
        cv.put(COL_PICTURE,R.drawable.nature_six);
        db.insert(TABLE_NAME, null, cv);


        cv = new ContentValues();
        cv.put(COL_TYPE, "BUILDING");
        cv.put(COL_PICTURE, R.drawable.bulid_one);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "BUILDING");
        cv.put(COL_PICTURE, R.drawable.bulid_two);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "BUILDING");
        cv.put(COL_PICTURE, R.drawable.bulid_three);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "BUILDING");
        cv.put(COL_PICTURE, R.drawable.bulid_four);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "BUILDING");
        cv.put(COL_PICTURE, R.drawable.bulid_five);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "BUILDING");
        cv.put(COL_PICTURE, R.drawable.bulid_six);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "FLOWER");
        cv.put(COL_PICTURE, R.drawable.flower_one);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "FLOWER");
        cv.put(COL_PICTURE, R.drawable.flower_two);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "FLOWER");
        cv.put(COL_PICTURE, R.drawable.flower_three);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "FLOWER");
        cv.put(COL_PICTURE, R.drawable.flower_four);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "FLOWER");
        cv.put(COL_PICTURE, R.drawable.flower_five);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "FLOWER");
        cv.put(COL_PICTURE, R.drawable.flower_six);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "SUNSET");
        cv.put(COL_PICTURE, R.drawable.sunset_one);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "SUNSET");
        cv.put(COL_PICTURE, R.drawable.sunset_two);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "SUNSET");
        cv.put(COL_PICTURE, R.drawable.sunset_three);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "SUNSET");
        cv.put(COL_PICTURE, R.drawable.sunset_four);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "SUNSET");
        cv.put(COL_PICTURE, R.drawable.sunset_five);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "SUNSET");
        cv.put(COL_PICTURE, R.drawable.sunset_six);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "MOUNTAIN");
        cv.put(COL_PICTURE, R.drawable.moun_one);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "MOUNTAIN");
        cv.put(COL_PICTURE, R.drawable.moun_two);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "MOUNTAIN");
        cv.put(COL_PICTURE, R.drawable.moun_three);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "MOUNTAIN");
        cv.put(COL_PICTURE, R.drawable.moun_four);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "MOUNTAIN");
        cv.put(COL_PICTURE, R.drawable.moun_five);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "MOUNTAIN");
        cv.put(COL_PICTURE, R.drawable.moun_six);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "SKY");
        cv.put(COL_PICTURE, R.drawable.sky_one);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "SKY");
        cv.put(COL_PICTURE, R.drawable.sky_two);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "SKY");
        cv.put(COL_PICTURE, R.drawable.sky_three);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "SKY");
        cv.put(COL_PICTURE, R.drawable.sky_four);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "SKY");
        cv.put(COL_PICTURE, R.drawable.sky_five);
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TYPE, "SKY");
        cv.put(COL_PICTURE, R.drawable.sky_six);
        db.insert(TABLE_NAME, null, cv);

    }
    //การ insert ค่าเข้าไปใน database

    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(" DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}