package com.example.win8.landscapeapp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.win8.landscapeapp.DB.DBList;

import java.util.ArrayList;

public class ListViewNature extends AppCompatActivity {

    private DBList mHelper;
    private SQLiteDatabase mDb;
    private ArrayList<PictureItem> mPictureItemList;
    private AdapterList adapterList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_nature);

        mHelper = new DBList(this);
        mDb = mHelper.getReadableDatabase();
        mPictureItemList = new ArrayList<PictureItem>();
        mHelper = new DBList(this);
        mDb = mHelper.getReadableDatabase();

        loadDataFromDb();
        adapterList = new AdapterList(this,R.layout.activity_nature,mPictureItemList);
        ListView iv = findViewById(R.id.list_list);
        iv.setAdapter(adapterList);



    }

    private void loadDataFromDb() {
        Cursor cursor = mDb.query(
                DBList.TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                null

        );

        while (cursor.moveToNext()) {
            String picture = cursor.getString(cursor.getColumnIndex(DBList.COL_PICTURE));
            int id = cursor.getInt(cursor.getColumnIndex(DBList.COL_ID));
            String type = cursor.getString(cursor.getColumnIndex(DBList.COL_TYPE));

            PictureItem item = new PictureItem(id,type,picture);
        }

    }
}

