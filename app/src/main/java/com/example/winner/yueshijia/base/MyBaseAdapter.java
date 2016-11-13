package com.example.winner.yueshijia.base;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by winner on 2016/11/8.
 */

public abstract class MyBaseAdapter<T> extends BaseAdapter {


    protected ArrayList<T> mList;

    public MyBaseAdapter() {
    }

    public MyBaseAdapter(ArrayList<T> list) {
        mList = list;
    }

    public void setData(ArrayList<T> list) {
        mList = list;
        notifyDataSetChanged();
    }

    public ArrayList<T> getList() {
        return mList;
    }

    @Override
    public int getCount() {
        return mList != null ? mList.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public abstract View getView(int position, View convertView, ViewGroup viewGroup);
}
