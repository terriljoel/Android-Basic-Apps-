package com.example.peter.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    LinearLayoutManager llm;
    adapter a;
    dsource data[]={
            new dsource( "johny" ),
            new dsource( "tommy" ),
            new dsource( "tom" ),
            new dsource( "4" ),
            new dsource( "tommy5" ),
            new dsource( "tommy6" ),
            new dsource( "tommy7" ),
            new dsource( "tommy8" ),
            new dsource( "tommy9" ),
            new dsource( "tommy10" )
    };
    RecyclerView r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        r=findViewById( R.id.recycle);
        llm=new LinearLayoutManager( this );
        r.setLayoutManager(llm);
        a=new adapter(data);
        r.setAdapter( a );
        a.setO
    }
}
