package com.example.peter.areacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main4Activity extends AppCompatActivity {
EditText t1,t2;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main4 );
        t1=findViewById( R.id.txt2 );
        t2=findViewById( R.id.txt3 );
        b=findViewById( R.id.button2 );
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!t1.getText().toString().equals(""))
                {
                    int l=Integer.parseInt(t1.getText().toString());
                    int a=l*l;
                    t2.setText( "Area="+String.valueOf( a )+"sq.units" );
                }
            }
        } );
    }
}
