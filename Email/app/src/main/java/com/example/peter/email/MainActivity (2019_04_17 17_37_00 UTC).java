package com.example.peter.email;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText e1,e2,e3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        ActivityCompat.requestPermissions( this,new String[]{Manifest.permission.INTERNET},1 );
        e1=(EditText)findViewById( R.id.editText );
        e2=(EditText)findViewById( R.id.editText2 );
        e3=(EditText)findViewById( R.id.editText3 );
      b=(Button)findViewById( R.id.button );
      b.setOnClickListener( new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent i=new Intent(Intent.ACTION_SENDTO);
              i.setType( "text/plain" );
              i.putExtra( Intent.EXTRA_SUBJECT,e2.getText().toString() );
              i.putExtra( Intent.EXTRA_TEXT,e3.getText().toString() );
              i.setData( Uri.parse("mailto:"+e1.getText().toString()) );
          startActivity( i );
          }
      } );
    }
}
