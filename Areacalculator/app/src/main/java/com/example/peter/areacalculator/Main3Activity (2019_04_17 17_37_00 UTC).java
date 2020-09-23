package com.example.peter.areacalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main3 );
        b1=findViewById( R.id.b1 );
        b2=findViewById( R.id.button3 );
        b3=findViewById( R.id.button4 );
        b4=findViewById( R.id.button5 );
        b1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent( Main3Activity.this,Main5Activity.class );
                startActivity( i );
            }
        } );
        b2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent( Main3Activity.this,Main4Activity.class );
                startActivity( in );
            }
        } );
        b3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte=new Intent( Main3Activity.this,Main6Activity.class );
                startActivity( inte );
            }
        } );
        b4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( Main3Activity.this,Main7Activity.class );
                startActivity( intent );
            }
        } );
    }
}
