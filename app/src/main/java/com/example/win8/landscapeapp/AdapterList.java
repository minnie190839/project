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
    private ArrayList<PictureItem> mPictureItemList ;

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
        View itemLayout = inflater.inflate(mLayoutResId, null);

        PictureItem item = mPictureItemList.get(position);

        ImageView picture = itemLayout.findViewById(R.id.img);

        String pictureFileName = item.picture;

    AssetManager am = mContext.getAssets();
    try {
        InputStream stream = am.open(pictureFileName);
        Drawable drawable = Drawable.createFromStream(stream, null);
        picture.setImageDrawable(drawable);

    } catch (IOException e) {
        e.printStackTrace();
    }

    return itemLayout;
}
}