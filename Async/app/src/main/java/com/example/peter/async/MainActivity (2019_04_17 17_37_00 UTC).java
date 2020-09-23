package com.example.peter.async;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
TextView t;
Button b;
ProgressBar p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        t=(TextView)findViewById( R.id.textView );
        b=(Button)findViewById( R.id.button );
        p=(ProgressBar)findViewById( R.id.progressBar );
        b.setOnClickListener( this );
    }

    @Override
    public void onClick(View view) {
        T t=new T();
        t.execute("100");
    }
    class T extends AsyncTask<String,Integer,String>
    {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... strings) {
            int i=0;
            int max= Integer.parseInt( strings[0] );
            while(i<max) {
                try {
                    Thread.sleep( 1000 );
                    i++;
                    publishProgress( i );
                } catch (Exception e) {
                    Log.e( "Error", e.toString() );
                }
            }
return null;        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate( values );
            p.setProgress( values[0] );
            t.setText( values[0].toString() );
        }
    }
}
