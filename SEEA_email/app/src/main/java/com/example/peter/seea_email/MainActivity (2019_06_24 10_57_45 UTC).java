package com.example.peter.seea_email;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText  e1,e2,e3;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        e1=(EditText)findViewById( R.id.editText );
        e2=(EditText)findViewById( R.id.editText2 );
        e3=(EditText)findViewById( R.id.editText3 );
        b=(Button)findViewById( R.id.button );
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_SENDTO);
                i.setType( "text/plain"  );
                i.setData( Uri.parse( "mailto:"+e1.getText().toString() ) );
                i.putExtra( Intent.EXTRA_SUBJECT,e2.getText().toString() );
                i.putExtra( Intent.EXTRA_TEXT,e3.getText().toString() );
                startActivity( i );
            }
        } );
    }
}
