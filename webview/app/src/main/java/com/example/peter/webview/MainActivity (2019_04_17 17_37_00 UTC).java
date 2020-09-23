package com.example.peter.webview;

import android.Manifest;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button b1,b2;
EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        b1=(Button)findViewById( R.id.button );
        b2=(Button)findViewById( R.id.button2 );
        e=(EditText)findViewById( R.id.editText );
        ActivityCompat.requestPermissions( this,new String[]{Manifest.permission.INTERNET},1 );
        b1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent( getApplicationContext(),Main2Activity.class );
                i.putExtra( "load","default12" );
                startActivity( i  );
            }
        } );
        b2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent( getApplicationContext(),Main2Activity.class);
                i.putExtra( "load",e.getText().toString() );
                startActivity( i );
            }
        } );
    }
}
