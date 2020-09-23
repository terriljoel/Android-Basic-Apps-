package com.example.peter.seeb_webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        e=(EditText)findViewById( R.id.editText );
        b1=(Button)findViewById( R.id.button );
        b2=(Button)findViewById( R.id.button2 );
        b1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent( getApplicationContext(),Main2Activity.class );
                i1.putExtra( "load",e.getText().toString() );
                startActivity( i1 );
            }
        } );
        b2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent( getApplicationContext(),Main2Activity.class );
                i2.putExtra( "load","default" );
                startActivity( i2 );
            }
        } );
    }
}
