package com.example.peter.gender;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton b1,b2;
    RadioGroup g;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        b1=(RadioButton)findViewById( R.id.radioButton );
        b2=(RadioButton)findViewById( R.id.radioButton2 );
        g=(RadioGroup)findViewById( R.id.rg );
        b=(Button)findViewById( R.id.button2 );
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = g.getCheckedRadioButtonId();
                if (i == -1)
                    Toast.makeText( getApplicationContext(), "Nothing selected", Toast.LENGTH_LONG ).show();
                else {
                    RadioButton b3 = (RadioButton) findViewById( i );
                    String s1=" "+b3.getText();

                    Toast.makeText( getApplicationContext(), s1, Toast.LENGTH_LONG ).show();
                }

            }      } );
    }
}
