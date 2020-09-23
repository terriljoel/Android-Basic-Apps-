
package com.example.peter.areacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText t1,t2;
    float r;
    double a;
Button b;
    private double compute(float r)
    {
        return 3.142*r*r;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );
        t1=findViewById( R.id.txt );
        t2=findViewById( R.id.txt1 );
        b=findViewById( R.id.button );
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!t1.getText().toString().equals( "" )) {
                    r = Float.parseFloat( t1.getText().toString() );
                    a = compute( r );
                    t2.setText( String.valueOf( a ) );
                }
            }
        } );



    }
}
