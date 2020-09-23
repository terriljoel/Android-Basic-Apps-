package com.example.peter.seea_telephony;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        t = (TextView) findViewById( R.id.txt );
        ActivityCompat.requestPermissions( MainActivity.this, new String[]{Manifest.permission.READ_PHONE_STATE}, 1 );
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService( Context.TELEPHONY_SERVICE );
        if (ActivityCompat.checkSelfPermission( this, Manifest.permission.READ_SMS ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission( this, Manifest.permission.READ_PHONE_NUMBERS ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission( this, Manifest.permission.READ_PHONE_STATE ) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        t.setText( "Phone number:" + telephonyManager.getLine1Number() );
        PhoneStateListener callStateListener=new PhoneStateListener()
        {
            @Override
            public void onCallStateChanged(int state, String phoneNumber) {
                if(state==TelephonyManager.CALL_STATE_RINGING)
                {
                    Toast.makeText( getApplicationContext(),"Phone is ringing",Toast.LENGTH_LONG ).show();

                }
                if(state==TelephonyManager.CALL_STATE_OFFHOOK)
                {
                    Toast.makeText( getApplicationContext(),"Phone is currently on a call",Toast.LENGTH_LONG).show();

                }
                if(state==TelephonyManager.CALL_STATE_IDLE)
                {
                    Toast.makeText( getApplicationContext(),"Phone is neither on a call nor in ringing",Toast.LENGTH_LONG).show();
                }
                //super.onCallStateChanged( state, phoneNumber );
            }
        };
        telephonyManager.listen( callStateListener,PhoneStateListener.LISTEN_CALL_STATE );
    }
}
