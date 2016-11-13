package com.example.winner.yueshijia.adpter.club;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.winner.yueshijia.listeners.OnItemClickListener;

import java.util.List;

/**
 * @author ling
 * @version 1.0
 * 2016/11/11 19:36
 */
public abstract class BaseClubAdapter<T> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    protected OnItemClickListener mOnItemClickListener;

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }
    protected Context mContext;


    protected List<T> mData;
    public BaseClubAdapter(Context context) {
        this.mContext = context;
    }

    public void setData(List<T> data) {
        this.mData=data;
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    /**
     *加载视图
     */
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mData!=null?mData.size():0;
    }

}
