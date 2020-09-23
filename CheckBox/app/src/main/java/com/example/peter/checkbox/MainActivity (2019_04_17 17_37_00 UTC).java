package com.example.peter.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    CheckBox c1, c2, c3, c4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        b = (Button) findViewById( R.id.button );
        c1 = (CheckBox) findViewById( R.id.checkBox );
        c2 = (CheckBox) findViewById( R.id.checkBox3 );
        c3 = (CheckBox) findViewById( R.id.checkBox4 );
        c4 = (CheckBox) findViewById( R.id.checkBox5 );
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = 0;
                StringBuilder s = new StringBuilder();
                s.append( "Ordered items are \n" );
                if (c1.isChecked()) {
                    s.append( "Biryani\n" );
                    sum += 120;

                }
                if (c2.isChecked()) {
                    s.append( "Mutton Machov\n" );
                    sum += 170;

                }
                if (c3.isChecked()) {
                    s.append( "Masala Papad\n" );
                    sum += 20;

                }
                if (c4.isChecked()) {
                    s.append( "Tuborg Strong\n" );
                    sum += 140;

                }
                Toast.makeText( getApplicationContext(), s+"Sum is-"+sum, Toast.LENGTH_LONG ).show();
            }
        } );

    }
}
