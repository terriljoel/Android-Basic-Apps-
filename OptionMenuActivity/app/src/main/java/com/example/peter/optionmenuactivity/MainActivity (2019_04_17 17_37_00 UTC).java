package com.example.peter.optionmenuactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater i=getMenuInflater();
        i.inflate(R.menu.m1,menu );
        return super.onCreateOptionsMenu( menu );
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.i1 : Intent I=new Intent( this,Main2Activity.class );
                   startActivity(I);
                return true;
            case R.id.i2 : Intent I1=new Intent( this,Main3Activity.class );
                startActivity(I1);
              return true;
          default:return onOptionsItemSelected( item );
        }
    }
}
