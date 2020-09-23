package com.example.peter.seeb_call_db;

import android.Manifest;
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
    Button b1,b2;
    EditText e1,e2,e3,e4;
    SQLiteDatabase db=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        e1=(EditText)findViewById( R.id.editText );
        e2=(EditText)findViewById( R.id.editText2 );
        e3=(EditText)findViewById( R.id.editText3 );
        e4=(EditText)findViewById( R.id.editText4 );
        b1=(Button)findViewById( R.id.button );
        b2=(Button)findViewById( R.id.button2 );
        ActivityCompat.requestPermissions( this,new String[]{Manifest.permission.CALL_PHONE},1 );
        b1.setOnClickListener( this );
        b2.setOnClickListener( this );
    }

    @Override
    public void onClick(View view) {
        String name, usn,ph;
        usn = e1.getText().toString();
        name = e2.getText().toString();
        ph = e3.getText().toString();
        try {
            db = this.openOrCreateDatabase( "stud01", MODE_PRIVATE, null );
            db.execSQL("create table if not exists test(usn varchar(20),name varchar(20),phone varchar(20));");
            if(view.getId()==b1.getId())
            {
                db.execSQL( "insert into test values('"+usn+"','"+name+"','"+ph+"');" );
                Toast.makeText(getApplicationContext(),"Row inserted succesfully",Toast.LENGTH_SHORT ).show();
            }
            if(view.getId()==b2.getId())
            {
                Cursor c=db.rawQuery( "select * from test where usn='"+e4.getText().toString()+"';",null );
                if(c.getCount()!=1)
                {
                    Toast.makeText( getApplicationContext(),"invalid",Toast.LENGTH_SHORT ).show();
                }
                else
                {
                    c.moveToNext();
                    ph=c.getString( c.getColumnIndex( "phone" ) ) ;
                    Intent i=new Intent( Intent.ACTION_CALL );
                    i.setData( Uri.parse("tel:"+ph) );
                    startActivity( i );
                }
            }
        }
        catch (SQLiteException e)
        {
            Toast.makeText( getApplicationContext(),"Error",Toast.LENGTH_SHORT ).show();

        }
        finally {
            if(db!=null)
                db.close();
        }
    }
}
