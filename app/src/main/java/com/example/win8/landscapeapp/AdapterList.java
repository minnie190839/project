package com.example.win8.landscapeapp;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by Win8 on 6/12/2560.
 */

public class AdapterList extends ArrayAdapter<PictureItem> {

    private Context mContext;
    private int mLayoutResId;
    private ArrayList<PictureItem> mPictureItemList ; //สร้าง arraylist ที่ชื่อว่า mPictureItemList

    public AdapterList(@NonNull Context context, int layoutResId, @NonNull ArrayList<PictureItem> picItemList) {
        super(context, layoutResId, picItemList);

        this.mContext = context;
        this.mLayoutResId = layoutResId;
        this.mPictureItemList = picItemList;
    }
@NonNull
@Override
public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
    LayoutInflater inflater = LayoutInflater.from(mContext);
    View itemLayout = inflater.inflate(mLayoutResId, null);//ที่เราทำทั้งหมดมันอยู่ใน mLayoutResId

    PictureItem item = mPictureItemList.get(position);
    //สั่งให้เอาค่า position ที่อยู่ใน mPictureItemList ไปเก็บไว้ object ชื่อ item


    ImageView picImageView = itemLayout.findViewById(R.id.img);
    //

    picImageView.setImageResource(item.picture);
    //set ค่าตำแหน่งของ resource รูป
    return itemLayout;
    }
}

