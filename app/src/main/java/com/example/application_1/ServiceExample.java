package com.example.application_1;

import android.app.Service;
import android.util.Log;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class ServiceExample extends Service
{
    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }

    @Override
    public void onCreate()
    {
        super.onCreate();
        Log.println(Log.INFO,"SERVICE","Service đã được khởi tạo !");
    }
    @Override
    public void onDestroy()
    {
        Log.println(Log.INFO,"DES","Service đã bị hủy");
        super.onDestroy();
    }
}
