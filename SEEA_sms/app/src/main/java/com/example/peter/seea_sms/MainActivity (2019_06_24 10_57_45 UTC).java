package com.example.peter.seea_sms;

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
        e1=(EditText)findViewById( R.id.editText2 );
        e2=(EditText)findViewById( R.id.editText );
        b=(Button)findViewById( R.id.button );
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph=e1.getText().toString();
                Intent i=new Intent( Intent.ACTION_VIEW);
                i.setData( Uri.parse("sms:"+ph) );
                i.putExtra( "sms_body",e2.getText().toString() );
                startActivity(i);
            }
        } );
    }
}
