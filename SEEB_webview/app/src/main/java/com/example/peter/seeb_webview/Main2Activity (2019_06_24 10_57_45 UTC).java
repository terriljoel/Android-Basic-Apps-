package com.example.peter.seeb_webview;

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
        String url=i.getStringExtra( "load" );
        if(url.equals(  "default"))
        {
            w.loadUrl( "file:///android_asset/a.html" );
        }
        else
            w.loadUrl( url );
    }
}
