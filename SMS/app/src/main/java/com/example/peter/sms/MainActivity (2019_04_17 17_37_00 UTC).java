package com.example.peter.sms;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        b=(Button)findViewById( R.id.button );
        e1=(EditText)findViewById( R.id.editText );
        e2=(EditText)findViewById( R.id.editText2 );
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent( Intent.ACTION_VIEW );
                String ph=e1.getText().toString();
                String sms=e2.getText().toString();
                i.setData( Uri.parse( "sms:"+ph ) );
                i.putExtra( "sms_body",sms );
                startActivity( i );
            }
        } );
    }
}
