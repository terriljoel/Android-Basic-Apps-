package com.example.peter.seea_backgrndclr;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        b=(Button)findViewById( R.id.button );
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RelativeLayout r=(RelativeLayout)findViewById( R.id.rel );
                Random gen=new Random(  );
                r.setBackgroundColor( Color.rgb(gen.nextInt(256),gen.nextInt(256),gen.nextInt(256)) );
            }
        } );
    }
}
