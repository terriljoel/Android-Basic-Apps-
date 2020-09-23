package com.example.peter.areacalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main8Activity extends AppCompatActivity {
   Button b1,b2,b3,b4,b5;
   TextView t1,t2,t3,t4;
   EditText e1,e2,e3;
   double v;
   float r,b,h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main8 );
        b1=findViewById( R.id.button9 );
        b2=findViewById( R.id.button10 );
        b3=findViewById( R.id.button11 );
        b4=findViewById( R.id.button12 );
        b5=findViewById( R.id.button13 );
        t1=findViewById( R.id.textView9 );
        t2=findViewById( R.id.textView10 );
        t3=findViewById( R.id.textView11 );
        t4=findViewById( R.id.textView12 );
        e1=findViewById( R.id.txt40 );
        e2=findViewById( R.id.txt46 );
        e3=findViewById( R.id.txt47 );
        b1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText( "Enter the radius" );
                t2.setText( "" );
                t3.setText( "" );
                b5.setOnClickListener( new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(!e1.getText().toString().equals( "" ))
                        {
                            r=Float.parseFloat( e1.getText().toString() );
                            v=1.333333*3.141592654*r*r*r;
                            t4.setText( "Volume="+v );

                        }
                    }
                } );
            }
        } );
        b2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText( "Enter the length" );
                t2.setText( "Enter the breadth" );
                t3.setText( "Enter the height" );
                b5.setOnClickListener( new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(!e1.getText().toString().equals( "" )&&!e2.getText().toString().equals( "" )&&!e3.getText().toString().equals( "" ))
                        {
                            r=Float.parseFloat( e1.getText().toString() );
                            b=Float.parseFloat( e2.getText().toString() );
                            h=Float.parseFloat( e3.getText().toString() );
                            v=r*b*h;
                            t4.setText( "Volume="+v );

                        }
                    }
                } );
            }
        } );
        b3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText( "Enter the radius" );
                t2.setText( "Enter the height" );
                t3.setText( "" );
                b5.setOnClickListener( new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(!e1.getText().toString().equals( "" )&&!e2.getText().toString().equals( "" ))
                        {
                            r=Float.parseFloat( e1.getText().toString() );
                            b=Float.parseFloat( e2.getText().toString() );

                            v=3.141592654*r*r*b;
                            t4.setText( "Volume="+v );

                        }
                    }
                } );

            }
        } );
        b4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText( "Enter the radius" );
                t2.setText( "Enter the height" );
                t3.setText( "" );
                b5.setOnClickListener( new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(!e1.getText().toString().equals( "" )&&!e2.getText().toString().equals( "" ))
                        {
                            r=Float.parseFloat( e1.getText().toString() );
                            b=Float.parseFloat( e2.getText().toString() );

                            v=0.33333*r*r*b*3.141592654;
                            t4.setText( "Volume="+v );

                        }
                    }
                } );

            }
        } );

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu2,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.area:
                Intent info=new Intent(Main8Activity.this,MainActivity.class);
                startActivity( info );
                break;


        }
        return false;
    }
}
