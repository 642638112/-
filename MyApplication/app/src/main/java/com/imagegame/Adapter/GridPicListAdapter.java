package com.imagegame.Adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.imagegame.Utils.ScreenUtil;

import java.util.List;

/**
 * Created by zml on 2016/4/1.
 */
public class GridPicListAdapter extends BaseAdapter {
   Context context;
    List<Bitmap> list;
    public GridPicListAdapter( Context context,List<Bitmap> list){
        this.list=list;
        this.context=context;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView iv_pic_item=null;
        int density= (int) ScreenUtil.getDeviceDensity(context);
        if(convertView==null){
            iv_pic_item=new ImageView(context);
            iv_pic_item.setLayoutParams(new GridView.LayoutParams(80*density,100*density));
            iv_pic_item.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        else {
            iv_pic_item=(ImageView)convertView;
        }

       // iv_pic_item.setBackgroundColor(R.color.black);
        iv_pic_item.setImageBitmap(list.get(position));
        return iv_pic_item;
    }
}
