package com.example.peter.seea_context_menu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        t=(TextView)findViewById( R.id.txt );
        registerForContextMenu( t );

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater m = getMenuInflater();
        m.inflate( R.menu.m1, menu );
        super.onCreateContextMenu( menu, v, menuInfo );
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        RelativeLayout r1 = (RelativeLayout) findViewById( R.id.rel );
        switch (item.getItemId()) {
            case R.id.red:
                r1.setBackgroundColor( Color.RED );
                return true;
            case R.id.green:
                r1.setBackgroundColor( Color.GREEN );
                return true;
        }
        return super.onContextItemSelected( item );

    }
}