package com.example.peter.seea_dialog_box;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
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
              AlertDialog.Builder builder;
              builder=new AlertDialog.Builder(MainActivity.this );
              builder.setTitle( "Change?" )
                      .setMessage( "Are sure you want to change the color?" )
                      .setPositiveButton( "Yes", new DialogInterface.OnClickListener() {
                          @Override
                          public void onClick(DialogInterface dialogInterface, int i) {
                              RelativeLayout r=(RelativeLayout)findViewById( R.id.rel );
                              Random gen=new Random(  );
                              r.setBackgroundColor( Color.rgb( gen.nextInt(256),gen.nextInt(256),gen.nextInt(256) ) );

                          }
                      } )
                      .setNegativeButton( "No", new DialogInterface.OnClickListener() {
                          @Override
                          public void onClick(DialogInterface dialogInterface, int i) {

                          }
                      } )
                      .setIcon( R.drawable.ic_launcher_background )
                      .show();
          }
      } );


    }
}
