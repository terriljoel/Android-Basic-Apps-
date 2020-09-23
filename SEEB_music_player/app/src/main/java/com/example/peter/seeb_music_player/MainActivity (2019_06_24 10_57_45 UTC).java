package com.example.peter.seeb_music_player;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.graphics.Color;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        b1=(Button)findViewById( R.id.button );
        b2=(Button)findViewById( R.id.button2 );
        b3=(Button)findViewById( R.id.button3 );
        b1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService( new Intent( getApplicationContext(),MyService.class ) );
            }
        } );
        b2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService( new Intent( getApplicationContext(),MyService.class ) );
            }
        } );
        b3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RelativeLayout r=(RelativeLayout)findViewById( R.id.rel );
                Random gen=new Random(  );
                r.setBackgroundColor( Color.rgb( gen.nextInt(),gen.nextInt(),gen.nextInt() ) );
            }
        } );

    }
}
