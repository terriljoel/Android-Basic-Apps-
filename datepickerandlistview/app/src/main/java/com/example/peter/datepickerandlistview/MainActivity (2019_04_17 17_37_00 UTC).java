package com.example.peter.datepickerandlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Log.d("LifeCycle","OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","OnStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","OnStop");
    }
}
