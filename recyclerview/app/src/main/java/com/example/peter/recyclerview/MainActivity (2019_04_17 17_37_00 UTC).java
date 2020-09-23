package com.example.peter.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
RecyclerView Re;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Re=(RecyclerView)findViewById( R.id.Recycle );
        Re.setLayoutManager( new LinearLayoutManager( this ) );
        String data[]={"c","c++","python","Kotlin","JavaScript","Php","8086","Lex","Yacc","Shell","Dbms","SQl","JavaDB","JavaSQLite","Java"};
        Re.setAdapter( new RecyclerADapter(data ) );

             }
}
