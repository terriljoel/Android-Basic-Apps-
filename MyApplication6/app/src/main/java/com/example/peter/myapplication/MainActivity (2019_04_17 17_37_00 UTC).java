package com.example.peter.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.iid.FirebaseInstanceIdService;

public class MainActivity extends AppCompatActivity {
    TextView t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        t=(TextView)findViewById( R.id.t1 );

    }
}
