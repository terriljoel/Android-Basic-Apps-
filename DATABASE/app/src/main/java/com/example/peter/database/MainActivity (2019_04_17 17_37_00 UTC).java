package com.example.peter.database;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button sel,ins;
EditText e1,e2,e3;
SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        sel=(Button)findViewById( R.id.button2 );
        ins=(Button)findViewById( R.id.button );
        e1=(EditText)findViewById( R.id.editText );
        e2=(EditText)findViewById( R.id.editText2 );
        e3=(EditText)findViewById( R.id.editText3 );
        ins.setOnClickListener( this );
        sel.setOnClickListener( this );
    }

    @Override
    public void onClick(View view) {
        String name,age,add;
        name=e1.getText().toString();
        age=e2.getText().toString();
        add=e3.getText().toString();
        Toast.makeText( this,"success",Toast.LENGTH_LONG ).show();
        try
        {
            db=this.openOrCreateDatabase("sample",MODE_PRIVATE,null );
            db.execSQL("CREATE TABLE IF NOT EXISTS TEST(name varchar(20),age varchar(20),address varchar(20));" );
            Toast.makeText( this,"sufdccess",Toast.LENGTH_LONG ).show();
            if(view.getId()==ins.getId())
            {
                db.execSQL( "INSERT INTO TEST VALUES('"+name+"','"+age+"','"+add+"');");
                Toast.makeText( this,"success",Toast.LENGTH_LONG ).show();
            }
            if(view.getId()==sel.getId())
            {
                String a;
                a="Name\t age\t age\n";
                Cursor c=db.rawQuery( "SELECT * FROM TEST",null );
                if(c!=null)
                {
                    if(c.moveToFirst())
                    {
                        do{
                            name=c.getString( c.getColumnIndex( "name" ));
                            age=c.getString( c.getColumnIndex( "age" ));
                            add=c.getString( c.getColumnIndex( "address" ));
                            a=a+name+"\t "+age+"\t "+add+"\n";
                           // Intent i=new Intent(Intent.ACTION_CALL );
                           // i.setData( Uri.parse("tel:"+age) );
                            //startActivity(i);
                        }while(c.moveToNext());
                    }
                    Toast.makeText( this,a,Toast.LENGTH_LONG ).show();
                }
            }
        }
        catch (SQLiteException e)
        {
            System.out.print( "could create" );
        }
        finally {
            if(db!=null)
                db.close();

        }
    }
}
