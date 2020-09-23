package com.example.peter.seeb_batterylevel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import android.graphics.Color;

public class MainActivity extends AppCompatActivity {
TextView t;
ProgressBar pb;
BroadcastReceiver b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        t=(TextView)findViewById( R.id.txt );
        pb=(ProgressBar)findViewById( R.id.progressBar );
        b=new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                int level=intent.getIntExtra( BatteryManager.EXTRA_LEVEL,0);
                t.setText( "Battery level:"+level );
                pb.setProgress( level );
                RelativeLayout r=(RelativeLayout)findViewById( R.id.rel);

                if(level>60)
                {
                    r.setBackgroundColor( Color.GREEN );
                }
                else if(level>30)
                {
                    r.setBackgroundColor( Color.BLUE );
                }
                else
                    r.setBackgroundColor( Color.RED );


            }
        };
    }

    @Override
    protected void onStart() {
        super.onStart();
       registerReceiver( b,new IntentFilter( Intent.ACTION_BATTERY_CHANGED ) );
    }

    @Override
    protected void onStop() {
        super.onStop();
    unregisterReceiver( b );
    }
}
