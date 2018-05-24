package com.example.vande.cs323_coledeanproject;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.os.Handler;
import android.widget.Toast;

public class ToastService extends IntentService {

    public static final String EXTRA_MESSAGE = "message";
    private Handler handler;

    public ToastService() {
        super("ToastService");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        handler = new Handler();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        synchronized (this) {
            try {
                wait(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String text = intent.getStringExtra(EXTRA_MESSAGE);
        showText(text);
    }

    private void showText(final String text) {
        handler.post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
            }
        });
    }

}
