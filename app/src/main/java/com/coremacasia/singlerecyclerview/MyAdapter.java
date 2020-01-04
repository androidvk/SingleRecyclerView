package com.coremacasia.singlerecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class MyAdapter extends RecyclerView.Adapter {
    private final Context context;
    private final MyListData[] myListData;

    public MyAdapter(Context context, MyListData[] myListData) {

        this.context = context;
        this.myListData = myListData;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       RecyclerView.ViewHolder holder;
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());// initialization of inflator
        View view=inflater.inflate(R.layout.list_data,parent,false);// assign view with help of inflator
        holder=new MyViewHolder(view);// assign view / xml to holder class
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder= (MyViewHolder) holder;
        myViewHolder.start(position,holder,myListData);

    }

    @Override
    public int getItemCount() {
        return myListData.length;
    }
}
