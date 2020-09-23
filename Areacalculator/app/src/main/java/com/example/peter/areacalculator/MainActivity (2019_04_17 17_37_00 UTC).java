package com.example.peter.areacalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        b1=findViewById( R.id.b1 );
        b2=findViewById( R.id.b2 );
        b1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent( MainActivity.this,Main2Activity.class );
                startActivity( i );

            }
        } );
        b2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent( MainActivity.this,Main3Activity.class );
                startActivity( in );
            }
        } );
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.volume:
                Intent info=new Intent(MainActivity.this,Main8Activity.class);
                startActivity( info );
                break;


        }
        return false;
    }
}
