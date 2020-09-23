package com.example.peter.areacalculator;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main6Activity extends AppCompatActivity {
    EditText t1,t2,t3;
    Button b;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main6 );
        t1=findViewById( R.id.txt7 );
        t2=findViewById( R.id.txt8 );
        t3=findViewById( R.id.txt9 );
        b=findViewById( R.id.button7 );
       b.setOnClickListener( new View.OnClickListener() {
           @Override
           public void onClick(View view) {


                if(!t1.getText().toString().equals( "" )&&!t2.getText().toString().equals( "" ))
                {
                    float l=Float.parseFloat( t2.getText().toString() );
                    float b=Float.parseFloat( t1.getText().toString() );

                    double a=b*l;
                    t3.setText( "Area of rectangle="+String.valueOf( a )+"sq.units" );
                }
            }
        } );
    }
}
