package com.rohan.gridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class GridViewActivity extends AppCompatActivity {
    ListView myListView;
    String[] dataArray={"One","Two","Three","Four","Five","Six"};
    GridView myGridview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        myGridview=findViewById(R.id.myGridView);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,R.layout.grid_item,dataArray);
        myGridview.setAdapter(adapter);

    }
}