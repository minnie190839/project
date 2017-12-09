package com.example.win8.landscapeapp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.win8.landscapeapp.DB.DBList;

import java.util.ArrayList;

public class ListViewBuild extends AppCompatActivity {

    private DBList mHelper;
    private SQLiteDatabase mDb;
    private ArrayList<PictureItem> mPictureItemList = new ArrayList<>();
    private AdapterList adapterList;
// การประกาศ object เรียกใช้คลาส
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_build);

        mHelper = new DBList(this); //สร้างก้อนๆหนึ่งไว้ชื่อ DBList
        mDb = mHelper.getReadableDatabase(); // นำข้อมูลทั้งหมดใน mhelper ไปเก็บไว้ใน Mdb

        loadDataFromDb(); //เรียกใช้ method
//        ArrayList<PictureItem> currentPictureItem = checkType("BUILDING");

        adapterList = new AdapterList(this,R.layout.activity_building, checkType("BUILDING"));
        ListView iv = findViewById(R.id.list_view);
        iv.setAdapter(adapterList);

    }
//ต้องการ check type ว่าอยู่ใน ประเภทนั้นรึเปล่า สมมุติว่า ถ้ามีคำว่า sky ก็จะให้ออกหน้า layuot ที่ตรงกับชื่อ
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

        //mPictureItemList.clear();

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

