package com.rohan.exercise.data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.rohan.exercise.R;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Intent intent=getIntent();
        String user=intent.getStringExtra("username");
        String password=intent.getStringExtra("password");
        TextView print=findViewById(R.id.registerText);
        print.setText(user+" " +password);
        Bundle bundle=getIntent().getExtras();
        String username=bundle.getString("name");
        //TextView print2=findViewById(R.id.registerText);
        //        print2.setText(username);




    }
}