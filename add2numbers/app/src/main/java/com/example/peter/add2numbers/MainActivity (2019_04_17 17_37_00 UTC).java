package com.example.peter.add2numbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        e1=(EditText)findViewById( R.id.editText );
        e2=(EditText)findViewById( R.id.editText2 );
     b=(Button)findViewById( R.id.button );
     b.setOnClickListener( new View.OnClickListener() {
         @Override
         public void onClick(View view) {
          float a=Float.parseFloat( e1.getText().toString());
             float b=Float.parseFloat( e2.getText().toString());
             float Sum=0;
             Toast.makeText( getApplicationContext(),"Sum is "+(a+b),Toast.LENGTH_LONG ).show();
         }
     } );
    }
}
