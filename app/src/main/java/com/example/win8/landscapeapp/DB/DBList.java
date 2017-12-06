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

    private static final String DATABASE_NAME ="pic.db";
    private static final int DATABASE_VERSION = 1;

    public static final String COL_TYPE = "type";
    public static final String COL_PICTURE = "picture";
    public static final String TABLE_NAME ="pic_image";
    public static final String COL_ID = "_id";

    private static final String CREATE_TABLE = "CREATE TABLE "
            + TABLE_NAME + "("
            + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COL_TYPE + " TEXT, "
            + COL_PICTURE + "INTEGER)";

    public DBList(Context context) {
        super(context, DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
        insertInitialData(db);
    }
    private void insertInitialData(SQLiteDatabase db) {
        ContentValues cv = new ContentValues();
        cv.put(COL_TYPE, "NATURE");
        cv.put(COL_PICTURE, "nature_one.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();

        cv.put(COL_TYPE, "NATURE");
        cv.put(COL_PICTURE, "nature_two.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();

        cv.put(COL_TYPE, "NATURE");
        cv.put(COL_PICTURE, "nature_three.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();

        cv.put(COL_TYPE, "NATURE");
        cv.put(COL_PICTURE, "nature_four.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();

        cv.put(COL_TYPE, "NATURE");
        cv.put(COL_PICTURE, "nature_five.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();

        cv.put(COL_TYPE, "NATURE");
        cv.put(COL_PICTURE,"nature_six.jpg");
        db.insert(TABLE_NAME, null, cv);

    }

    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(" DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
