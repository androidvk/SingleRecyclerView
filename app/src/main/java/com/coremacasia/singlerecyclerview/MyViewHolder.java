package com.coremacasia.singlerecyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    private int position;
    private RecyclerView.ViewHolder holder;
    private MyListData[] myListData;
    private ImageView imageView;

    private TextView textView;
    public MyViewHolder(View view) {
        super(view);
        textView=view.findViewById(R.id.listText);
        imageView=view.findViewById(R.id.listImg);

    }

    public void start(int position, RecyclerView.ViewHolder holder,
                      MyListData[] myListData) {


        this.position = position;
        this.holder = holder;
        this.myListData = myListData;

        textView.setText(myListData[position].getDescription()
        +"\n"+"Type: "+myListData[position].getType()+" \n"+"Position: "+position);
        imageView.setImageResource(myListData[position].getIcon());


    }
}
