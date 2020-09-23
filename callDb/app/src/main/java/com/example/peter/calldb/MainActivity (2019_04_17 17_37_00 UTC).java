package com.example.peter.calldb;

import android.Manifest;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText e1,e2,e3,e4;
Button b1,b2;
SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE } ,1);
        setContentView( R.layout.activity_main );
        b2=(Button)findViewById( R.id.button2 );
        b1=(Button)findViewById( R.id.button );
        e1=(EditText)findViewById( R.id.editText );
        e2=(EditText)findViewById( R.id.editText2 );
        e3=(EditText)findViewById( R.id.editText3 );
        e4=(EditText)findViewById( R.id.editText4);
        db=new S( this ).getWritableDatabase();
        b1.setOnClickListener( this );
        b2.setOnClickListener( this );
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==b1.getId()) {
            String name, number, usn;
            name = e1.getText().toString();
            number = e2.getText().toString();
            usn = e3.getText().toString();
            if (name == "" || number == "" || usn == "")
                Toast.makeText( getApplicationContext(), "invalid", Toast.LENGTH_SHORT ).show();
            else {
                ContentValues values=new ContentValues();
                values.put( "name",name );
                values.put( "number",number );
                values.put( "usn",usn );
                db.insert( "stud",null,values );
                Toast.makeText( getApplicationContext(), "alid", Toast.LENGTH_SHORT ).show();


            }

        }
        if(view.getId()==b2.getId())
        {
            Cursor c=db.rawQuery( "select * from stud where usn='"+e4.getText().toString()+"';",null );
            if(c.getCount()==1)
            {
                c.moveToNext();
                 Intent i;
                i = new Intent(Intent.ACTION_CALL );
                i.setData( Uri.parse( "tel:"+c.getString( c.getColumnIndex( "number" )) ) );
                try {


                    startActivity( i );
                }
                catch (Exception e)
                {
                    Toast.makeText( getApplicationContext(),"errot",Toast.LENGTH_SHORT ).show();
                }
            }

    }
}
}
