package com.example.peter.seeb_async_task;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
ProgressBar pb;
TextView t;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        b=(Button)findViewById( R.id.button );
        t=(TextView)findViewById( R.id.textView );
        pb=(ProgressBar)findViewById( R.id.progressBar );
        b.setOnClickListener( this);

    }

    @Override
    public void onClick(View view) {
        T t1=new T();
        t1.execute( "100" );
    }

    class T extends AsyncTask<String,Integer,String>
    {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... strings) {
            int max=Integer.parseInt( strings[0] );
            int i=0;
            while(i<max)
            {
                try {
                    Thread.sleep( 1000 );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
                publishProgress( i );
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            pb.setProgress( values[0] );
            t.setText( values[0].toString() );
            super.onProgressUpdate( values );
        }
    }
}
