package com.example.zikan.photomaker;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.ListView;

import java.util.ArrayList;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class DeletedService extends Service {

    ListView NewPhotos = (ListView)findViewById(R.id.NewPhotos);
    ArrayList PhNames = new ArrayList();
    ListView DeletedPhotos = (ListView)findViewById(R.id.DeletedPhotos);
    ArrayList DelNames = new ArrayList();
    public final static String EXTRA_MESSAGE ="com.exmple.zikan.photomaker.MESSAGE";

    public DeletedService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
