package com.rohan.recycler;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class CustomListViewActivity extends AppCompatActivity {
    ListView customListView;
    String[] dataArray = {"One","Two","Three","Four","Five","Six","Seven","Eight","One","Two",
            "Three","Four","Five","Six","Seven","Eight","One","Two","Three","Four","Five",
            "Six","Seven","Eight"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        //init
        customListView = findViewById(R.id.custom_list_view);
        //adapter init
        CustomListAdapter adapter = new CustomListAdapter(this,dataArray);
        //set adapter
        customListView.setAdapter(adapter);
    }
}