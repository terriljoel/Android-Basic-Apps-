package com.example.peter.progressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar p;
    Button b;
    int p1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        p = (ProgressBar) findViewById( R.id.progressBar );
        b = (Button) findViewById( R.id.button );
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setPV( p1 );
            }
            public void setPV(final int pv)
            {
                p.setProgress( pv );
                Thread t=new Thread(  ){
                    public void run()
                    {
                        try{
                            Thread.sleep( 300 );
                        }
                        catch(Exception e)
                        {

                    }
                    setPV( pv+10 );
                }

            };
                t.start();
        } });

    }

}
