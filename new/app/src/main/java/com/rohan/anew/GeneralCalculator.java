package com.rohan.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class GeneralCalculator extends AppCompatActivity {
  
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_calculator);
        EditText num1=(findViewById(R.id.num1));
        int n1=Integer.parseInt(num1.toString());
        EditText num2=(findViewById(R.id.num1));
        int n2=Integer.parseInt(num1.toString());
        Button button=findViewById(R.id.button);
        
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum=n1+n2;
                String message=String.valueOf(sum);
                Toast.makeText(GeneralCalculator.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}