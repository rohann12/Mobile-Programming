package com.rohan.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.rohan.exercise.data.RegisterActivity;

public class NewLogin extends AppCompatActivity {
 Button login_btn;
 Button register_btn;
 Button forgot_btn;
 EditText username;
 EditText password;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_login);
        login_btn=findViewById(R.id.login1);
        register_btn=findViewById(R.id.register1);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        String name=username.getText().toString();
        username.setText(name);
        String pass=password.getText().toString();
        password.setText(pass);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent=new Intent(NewLogin.this, RegisterActivity.class);
                intent.putExtra("username",name);
                intent.putExtra("password",pass);

                Bundle bundle= new Bundle();
                bundle.putString("name","Rohan");
                bundle.putInt("age",12);
                intent.putExtras(bundle);
                startActivity(intent);


            }
        });


    }
}