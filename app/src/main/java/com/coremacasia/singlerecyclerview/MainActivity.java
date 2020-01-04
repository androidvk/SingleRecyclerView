package com.coremacasia.singlerecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);

        MyListData[] myListData = new MyListData[] {
                new MyListData("Email", android.R.drawable.ic_dialog_email,1),
                new MyListData("Info", android.R.drawable.ic_dialog_info,2),
                new MyListData("Delete", android.R.drawable.ic_delete,1),
                new MyListData("Dialer", android.R.drawable.ic_dialog_dialer,2),
                new MyListData("Alert", android.R.drawable.ic_dialog_alert,1),
                new MyListData("Map", android.R.drawable.ic_dialog_map,2),
                new MyListData("Email", android.R.drawable.ic_dialog_email,2),
                new MyListData("Info", android.R.drawable.ic_dialog_info,1),
                new MyListData("Delete", android.R.drawable.ic_delete,1),
                new MyListData("Dialer", android.R.drawable.ic_dialog_dialer,2),
                new MyListData("Alert", android.R.drawable.ic_dialog_alert,2),
                new MyListData("Map", android.R.drawable.ic_dialog_map,1),
        };

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        MyAdapter myAdapter=new MyAdapter(getApplicationContext(),myListData);
        recyclerView.setAdapter(myAdapter);


    }
}
