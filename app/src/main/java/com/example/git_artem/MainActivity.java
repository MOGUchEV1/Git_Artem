package com.example.git_artem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1;
    TextView textView;
    int count =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1= findViewById(R.id.button);
        textView=findViewById(R.id.b1);
    }

    public void buttonSetText(View view) {
        textView.setText("Хеллоу");
    }
}