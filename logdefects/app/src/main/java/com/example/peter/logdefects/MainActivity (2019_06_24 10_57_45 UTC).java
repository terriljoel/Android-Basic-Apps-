package com.example.peter.logdefects;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Log.d("Lifecycle","On Create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle","On Start");
    }

    @Override
    protected void onStop() {
        super.onStop();
     Log.d("Lifecycle","On Stop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle","On Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
    Log.d("Lifecycle","On Resume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    Log.d("Lifecycle","On Destroy");
    }
}
