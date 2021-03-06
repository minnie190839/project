package com.example.win8.landscapeapp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.win8.landscapeapp.DB.DBList;

import java.util.ArrayList;

public class ListViewMountain extends AppCompatActivity {

    private DBList mHelper;
    private SQLiteDatabase mDb;
    private ArrayList<PictureItem> mPictureItemList = new ArrayList<>();
    private AdapterList adapterList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_mountain);

        mHelper = new DBList(this);
        mDb = mHelper.getReadableDatabase();

        loadDataFromDb();
//        ArrayList<PictureItem> currentPictureItem = checkType("MOUNTAIN");

        adapterList = new AdapterList(this,R.layout.activity_mountain, checkType("MOUNTAIN"));
        ListView iv = findViewById(R.id.list_view);
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

        mPictureItemList.clear();


        while (cursor.moveToNext()) {
            int id = cursor.getInt(cursor.getColumnIndex(DBList.COL_ID));
            String type = cursor.getString(cursor.getColumnIndex(DBList.COL_TYPE));
            int picture = Integer.parseInt(cursor.getString(cursor.getColumnIndex(DBList.COL_PICTURE)));

            PictureItem item = new PictureItem(id,type,picture);
            mPictureItemList.add(item);
        }

    }

    public ArrayList<PictureItem> checkType(String currentType){
        ArrayList<PictureItem> currentPictureItem = new ArrayList<>();

        for(int index = 0 ; index < mPictureItemList.size(); ++index) {
            if(mPictureItemList.get(index).type.equals(currentType)) {
                currentPictureItem.add(mPictureItemList.get(index));
            }
        }

        return currentPictureItem;
    }
}
