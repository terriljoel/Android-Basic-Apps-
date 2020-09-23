package com.example.peter.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView t;
    Bundle b;
    String s1,s2,s3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );
        b=getIntent().getExtras();
        if(b!=null)
        {
           s1=b.getString( "NAME" );
           s2=b.getString( "NA" );
           s3=b.getString( "NAM" );

        }
        if(s1!=null) {
            t = findViewById( R.id.txt );
            t.setText( "Welcome again" );
        }
        else if(s2!=null)
        {
            t=findViewById( R.id.txt );
            t.setText("Info is selected");
        }
        else
        {
            t=findViewById( R.id.txt );
            t.setText( "Dummy" );
        }
    }
}
