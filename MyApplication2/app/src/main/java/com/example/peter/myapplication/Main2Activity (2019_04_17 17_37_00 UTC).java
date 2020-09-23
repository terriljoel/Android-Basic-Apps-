package com.example.peter.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Bundle extra;
    TextView nam,n;
    String name,na;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        extra=getIntent().getExtras();
        if(extra!=null){
             name=extra.getString("NAME");
             na=extra.getString("nam");

        }
        nam=findViewById(R.id.text);
        nam.setText(name);
        n=findViewById(R.id.txt);
        n.setText("roll");
    }
}
