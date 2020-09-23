package com.example.peter.seeb_db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2;
    EditText e1,e2,e3;
    SQLiteDatabase db=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        e1=(EditText)findViewById( R.id.editText );
        e2=(EditText)findViewById( R.id.editText2 );
        e3=(EditText)findViewById( R.id.editText3 );
        b1=(Button)findViewById( R.id.button );
        b2=(Button)findViewById( R.id.button2 );
        b1.setOnClickListener( this );
        b2.setOnClickListener( this );
    }

    @Override
    public void onClick(View view) {
        String name,age,add;
        name=e1.getText().toString();
        age=e2.getText().toString();
        add=e3.getText().toString();
        try {
            db = this.openOrCreateDatabase( "stud", MODE_PRIVATE, null );
            db.execSQL( "create table if not exists test(name varchar(20),age varchar(20),address varchar(50));" );


            if (view.getId() == b1.getId()) {
                db.execSQL( "insert into test values('"+name+"','"+age+"','"+add+"');" );
                Toast.makeText( getApplicationContext(),"Row inserted successfully",Toast.LENGTH_SHORT ).show();


            }
            if(view.getId()==b2.getId())
            {
                Cursor c=db.rawQuery( "select * from test",null );
                String all="";

                if(c!=null)
                {
                    if(c.moveToFirst())
                    {
                        do{
                            name=c.getString( c.getColumnIndex( "name" ) );
                            age=c.getString( c.getColumnIndex( "age" ) );
                            add=c.getString( c.getColumnIndex( "address" ) );
                            all=all+name+"\t\t"+age+"\t\t"+add+"\n";

                        }while(c.moveToNext());
                        Toast.makeText( this,all,Toast.LENGTH_SHORT ).show();
                    }
                }
            }
        }
        catch (SQLiteException sq)
        {
            Toast.makeText( getApplicationContext(),"Could not create or open database",Toast.LENGTH_SHORT ).show();
        }
        finally {
            if(db!=null)
                db.close();
        }
    }
}
