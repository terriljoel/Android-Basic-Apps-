package com.example.peter.seea_option_menu;

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
        MenuInflater m=getMenuInflater();
        m.inflate( R.menu.m1,menu );
        return super.onCreateOptionsMenu( menu );
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
           case  R.id.item1: Intent i=new Intent(this,Main2Activity.class);
                        startActivity(i);
                        return true;

           case R.id.item2 : Intent i1=new Intent(this,Main3Activity.class);
                         startActivity( i1 );
                         return true;
        }
        return super.onOptionsItemSelected( item );
    }
}
