package com.example.peter.privateinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );
        b1=findViewById( R.id.button2 );
        b2=findViewById( R.id.button3 );
        b3=findViewById( R.id.button4 );
        b4=findViewById( R.id.button5 );
        b5=findViewById( R.id.button6);
        b1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent( Main2Activity.this,Main3Activity.class );
                startActivity( i );
            }
        } );
        b2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent( Main2Activity.this,Main4Activity.class );
                startActivity( i );
            }
        } );
        b3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent( Main2Activity.this,Main5Activity.class );
                startActivity( i );
            }
        } );
        b4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent( Main2Activity.this,Main6Activity.class );
                startActivity( i );
            }
        } );
        b5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent( Main2Activity.this,Main7Activity.class );
                startActivity( i );
            }
        } );
    }
}
