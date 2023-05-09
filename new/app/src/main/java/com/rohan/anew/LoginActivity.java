package com.rohan.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username=findViewById(R.id.username);

        password=findViewById(R.id.password);
        submit=findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
         @Override
            public void onClick(View view) {
             Intent intent=new Intent(LoginActivity.this,MainActivity.class);
             if(username.toString()=="rohan" && password.toString()=="190608"){

                 Toast.makeText(LoginActivity.this, "login bhayo", Toast.LENGTH_SHORT).show();
                 startActivity(intent);
             }


         }

        }
        );


    }
}