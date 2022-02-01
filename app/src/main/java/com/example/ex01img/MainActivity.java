package com.example.ex01img;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView iv;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        iv = findViewById(R.id.iv);
    }

    public void go(View view) {
        int x = (int)(101*Math.random())%3+1;
        btn.setText("Click number: "+ x);
        if(x==1){
            iv.setImageResource(R.drawable.n1);
        }
        else if(x==2){
            iv.setImageResource(R.drawable.n2);
        }
        else{
            iv.setImageResource(R.drawable.n3);
        }
    }

}