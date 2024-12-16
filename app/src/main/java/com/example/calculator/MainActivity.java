package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
b1=(Button)findViewById(R.id.addition);
b2=(Button)findViewById(R.id.subtraction);
b3=(Button)findViewById(R.id.multiplication);
b4=(Button)findViewById(R.id.division);
b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i=new Intent(getApplicationContext(), Addition.class);
        startActivity(i);
    }
});
b2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i1=new Intent(getApplicationContext(),Subtraction.class);
        startActivity(i1);
    }
});
b3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i2=new Intent(getApplicationContext(), Multiplication.class);
        startActivity(i2);
    }
});
b4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i3=new Intent(getApplicationContext(),Division.class);
        startActivity(i3);
    }
});
    }
}