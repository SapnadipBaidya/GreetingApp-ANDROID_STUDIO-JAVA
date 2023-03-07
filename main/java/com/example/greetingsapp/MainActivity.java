package com.example.greetingsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText editText ;
TextView textView;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editTextId);
        textView=findViewById(R.id.viewTxt);
        button=findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();
                Toast.makeText(MainActivity.this,"Hello "+ name,Toast.LENGTH_LONG).show();
            }
        });
    }
}