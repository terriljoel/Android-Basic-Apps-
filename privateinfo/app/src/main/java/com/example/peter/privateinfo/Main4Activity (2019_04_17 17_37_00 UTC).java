package com.example.peter.privateinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    TextView t1;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main4 );
        t1=findViewById( R.id.txt7 );
        b=findViewById( R.id.button8);
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText( "joelfacebook" );
            }
        } );
    }
}
