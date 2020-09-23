package com.example.peter.seea_camera;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
//ImageView i;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        b=(Button)findViewById( R.id.button );
        //i=(ImageView)findViewById( R.id.imageView );
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t=new Intent( MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult( t,1 );
            }
        } );

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode==1 && resultCode==RESULT_OK)
        {
            Bundle extra=data.getExtras();
            Bitmap image=(Bitmap)extra.get( "data" );
            BitmapDrawable drawable=new BitmapDrawable( image );
            RelativeLayout r=(RelativeLayout)findViewById( R.id.rel );
            r.setBackground(drawable );
        }
        super.onActivityResult( requestCode, resultCode, data );
    }
}
