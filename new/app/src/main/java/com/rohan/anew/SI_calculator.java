package com.rohan.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SI_calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_si_calculator);
        EditText p=(findViewById(R.id.principal));
        int P=Integer.parseInt(p.toString());
        EditText t=(findViewById(R.id.time));
        int T=Integer.parseInt(t.toString());
        EditText r=(findViewById(R.id.rate));
        int R=Integer.parseInt(r.toString());


        Button button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int SI=(P*T*R)/+100;
                String message=String.valueOf(SI);
                Toast.makeText(SI_calculator.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}