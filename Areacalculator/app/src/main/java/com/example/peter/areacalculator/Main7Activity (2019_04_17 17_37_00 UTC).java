package com.example.peter.areacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main7Activity extends AppCompatActivity {
    EditText t1,t2,t3;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main7 );
        t1=findViewById( R.id.txt10 );
        t2=findViewById( R.id.txt11);
        t3=findViewById( R.id.txt12 );
        b=findViewById( R.id.button8);
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!t1.getText().toString().equals( "" )&&!t2.getText().toString().equals( "" ))
                {
                    float l=Float.parseFloat( t2.getText().toString() );
                    float h=Float.parseFloat( t1.getText().toString() );

                    double a=(0.5*5*l*h);
                    t3.setText( "Area of pentagon="+String.valueOf( a )+"sq.units" );
                }
            }
        } );
    }
}
