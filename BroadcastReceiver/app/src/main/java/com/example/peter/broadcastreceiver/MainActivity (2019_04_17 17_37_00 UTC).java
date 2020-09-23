package com.example.peter.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.BatteryManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
ProgressBar p;
TextView t1;
BroadcastReceiver b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        t1=(TextView)findViewById( R.id.textView );
        p=(ProgressBar)findViewById( R.id.progressBar );
        b=new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                int level=intent.getIntExtra( BatteryManager.EXTRA_LEVEL,0 );
                t1.setText( "Battery level:"+level );
                p.setProgress( level );
                RelativeLayout r=(RelativeLayout)findViewById( R.id.Rlayout );
                if(level>60)
                    r.setBackgroundColor( Color.GREEN );
                else if(level>30)
                    r.setBackgroundColor( Color.BLUE );
                else
                    r.setBackgroundColor( Color.RED );
            }
        };


        }

    @Override
    protected void onStart() {
        super.onStart();
        registerReceiver( b, new IntentFilter( Intent.ACTION_BATTERY_CHANGED) );


    }

    @Override
    protected void onStop() {
        unregisterReceiver( b );
        super.onStop();
    }
}

