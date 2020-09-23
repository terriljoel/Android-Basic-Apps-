package com.example.peter.seeb_datepicker_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
DatePicker dp;
ListView l;
ArrayAdapter ad;
String s[]={"CSE","ISE","ME","EC"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        ad= new ArrayAdapter<String>(this,R.layout.layout, s);
        l=(ListView)findViewById( R.id.list1 );
        dp=(DatePicker)findViewById( R.id.date1 );
        l.setAdapter( ad );
        l.setOnItemClickListener( this );
       // dp.setOnDateChangedListener( this );
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String c=(String)ad.getItem( i );
        String dat=dp.getDayOfMonth()+"-"+(dp.getMonth()+1)+"-"+dp.getYear();
        String tost=" Joined on : "+dat+" and selected course: "+c;
        Toast.makeText( getApplicationContext(),tost,Toast.LENGTH_SHORT ).show();

    }
}
