package com.example.peter.phonecall;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText e;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        ActivityCompat.requestPermissions( this,new String[]{Manifest.permission.CALL_PHONE},1 );
        b=(Button)findViewById( R.id.button );
        e=(EditText)findViewById( R.id.editText );
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph=e.getText().toString();
                Intent i=new Intent( Intent.ACTION_CALL );
                i.setData( Uri.parse("tel:"+ph) );
                try {
                    startActivity( i );
                }
                catch (Exception e)
                {
                    Toast.makeText( getApplicationContext(),"permission required",Toast.LENGTH_LONG ).show();
                }
            }
        } );
    }
}
