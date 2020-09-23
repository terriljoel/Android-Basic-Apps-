package com.example.peter.webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {
WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );
        w=(WebView)findViewById( R.id.web );
        w.setWebViewClient( new WebViewClient() );
        Intent i=getIntent();
        String extra=i.getStringExtra( "load" );
        if(extra.equals(  "default12"))
        {
            w.loadUrl( "http://guru.nmamit.in" );
        }
        else
            w.loadUrl(extra);
    }
}
