package com.example.peter.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ArrayAdapter<String>  ad;

    String s2[]={"cse","ec","ise","ee","me"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        ad=new ArrayAdapter<String>(this,R.layout.layout,s2);
   Spinner s=(Spinner)findViewById( R.id.spinner );
        s.setAdapter( ad );
       s.setOnItemSelectedListener( new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
               String s1=ad.getItem( i ).toString();
               Toast.makeText( getApplicationContext(),s1,Toast.LENGTH_LONG ).show();
           }

           @Override
           public void onNothingSelected(AdapterView<?> adapterView) {

           }
       } );
    }
}
