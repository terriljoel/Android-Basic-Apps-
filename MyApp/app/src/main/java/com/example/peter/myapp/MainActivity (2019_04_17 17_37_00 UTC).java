package com.example.peter.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sub=findViewById(R.id.button);
        sub.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent new_activity=new Intent(MainActivity.this, Main2Activity.class);
                new_activity.putExtra("NAME","min");
                startActivity( new_activity );
            }
        } );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.app, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.inf:
                Intent info = new Intent(MainActivity.this, Main2Activity.class);
                info.putExtra("NA", "You have selected info");
                startActivity(info);
                break;
            case R.id.dum:
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("NAM", "this is dummy");
                startActivity(i);
                break;

        }
        return false;
    }
}
