package com.example.peter.mediaplayer1;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class MyService extends Service
{
    @Nullable
    @Override
    public MyService(){

    }

    @Override
    public void onCreate() {
        super.onCreate();
        final int resID
        MediaPlayer music=MediaPlayer.create( this.R. )
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException( "Not yet implemented" );
    }
}
