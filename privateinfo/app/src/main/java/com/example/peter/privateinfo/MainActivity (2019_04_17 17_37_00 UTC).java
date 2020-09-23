package com.example.peter.privateinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private EditText t1,t2;
   private Button b;
   private TextView t;
   private int count=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        t1=findViewById( R.id.txt );
        t2=findViewById( R.id.txt1 );
        t=findViewById( R.id.txt2 );
        b=findViewById( R.id.button );
        t.setText( "No of attempts remaining: "+String.valueOf( count ) );
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((t1.getText().toString().equals( "terriljoel" )) && t2.getText().toString().equals( "joelprivate" ))
                {
                    Intent i=new Intent( MainActivity.this,Main2Activity.class );
                    startActivity( i );
                }
                else
                {
                    count--;
                    t.setText( "No of attempts remaining:"+String.valueOf( count ) );
                    if(count==0)
                        b.setEnabled( false );
                }
            }
        } );

    }

}
