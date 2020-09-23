package com.example.peter.myapplication3;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, DatePicker.OnDateChangedListener {
    DatePicker d;
    ArrayAdapter<String> ad;
    String s[]={"cse","ec","ise","ee","me"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ad=new ArrayAdapter<String>(this,R.layout.m1,s);
        ListView L=(ListView)findViewById( R.id.list1 );
        L.setAdapter( ad );
        L.setOnItemClickListener( this );
        d=(DatePicker)findViewById( R.id.date1 );
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            d.setOnDateChangedListener(this);
        }
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String s1=(String)ad.getItem(i);
        Toast.makeText( getApplicationContext(),s1,Toast.LENGTH_SHORT ).show();
    }

    @Override
    public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
        String s2=d.getDayOfMonth()+"-"+(d.getMonth()+1)+"-"+d.getYear();
        Toast.makeText( getApplicationContext(),s2,Toast.LENGTH_SHORT ).show();

    }
}
