package com.example.peter.contextmenutochangeclor;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        TextView t=(TextView)findViewById( R.id.textView );
        registerForContextMenu( t );
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        super.onCreateContextMenu( menu, v, menuInfo );
        MenuInflater m=getMenuInflater();
        m.inflate(R.menu.m1,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        RelativeLayout r=(RelativeLayout)findViewById( R.id.relate );
        switch(item.getItemId())
        {
            case R.id.i1:r.setBackgroundColor( Color.GREEN );
            return true;
            case R.id.i2:r.setBackgroundColor( Color.RED);
                return true;
            default:return super.onContextItemSelected( item );
        }

    }
}
