package com.example.peter.seea_phone;

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

public class MainActivity extends AppCompatActivity {
EditText e;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
       e=(EditText)findViewById( R.id.editText );
       b=(Button)findViewById( R.id.button );
        ActivityCompat.requestPermissions( this,new String[]{Manifest.permission.CALL_PHONE},1 );
       b.setOnClickListener( new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i=new Intent(Intent.ACTION_CALL);
               i.setData( Uri.parse("tel:"+e.getText().toString()) );
               try{
                   startActivity( i );
               }
               catch (Exception e)
               {
                   Toast.makeText( getApplicationContext(),"Error",Toast.LENGTH_SHORT ).show();
               }
           }
       } );
    }
}
