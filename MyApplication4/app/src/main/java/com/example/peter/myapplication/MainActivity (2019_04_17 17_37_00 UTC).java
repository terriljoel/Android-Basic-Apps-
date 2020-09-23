package com.example.peter.myapplication;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText n,c;
    TextView t;
    SharedPreferences shar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        b=findViewById(R.id.but );
        n=findViewById( R.id.txt );
        c=findViewById( R.id.coll );
        t=findViewById( R.id.t );
        shar=getPreferences( MODE_PRIVATE );
        String nme=shar.getString("NAME","NTHNG to show");
      String coll= shar.getString( "COLLEGE","Nothing to show" );

        t.setText("Hi "+nme+" from "+coll);
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor=shar.edit();
                editor.putString( "NAME",n.getText().toString() );
                editor.putString("COLLEGE",c.getText().toString());
                t.setText("Hi "+n.getText().toString()+" from "+c.getText().toString());
                editor.commit();

            }
        } );


    }
}
