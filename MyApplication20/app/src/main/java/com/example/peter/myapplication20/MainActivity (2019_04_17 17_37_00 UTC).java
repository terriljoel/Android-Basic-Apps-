package com.example.peter.myapplication20;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Member;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity  {
DatabaseReference db;
EditText e1,e2,e3;
Button b;
 member meb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        e1=(EditText)findViewById( R.id.editText );
        e2=(EditText)findViewById( R.id.editText3 );
        e3=(EditText)findViewById( R.id.editText4 );


        b=(Button)findViewById( R.id.button3 );
        db=FirebaseDatabase.getInstance().getReference().child( "member" );
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

int age=Integer.parseInt( e2.getText().toString().trim() );
Long ph=Long.parseLong( e3.getText().toString().trim() );
String name=e1.getText().toString();
                meb=new member(name,age,ph);
                db.push().setValue( meb );
                Toast.makeText(getApplicationContext(),"Data successfully inserted", Toast.LENGTH_LONG ).show();

            }
        } );



    }


}
