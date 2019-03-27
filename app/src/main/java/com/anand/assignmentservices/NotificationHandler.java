package com.anand.assignmentservices;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import android.content.BroadcastReceiver;

public class NotificationHandler extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String intentAction = intent.getAction();
        if (intentAction.equals(DownloadManager.ACTION_DOWNLOAD_COMPLETE)) {
            Toast.makeText(context, "Files downloaded!", Toast.LENGTH_LONG).show();
        }
    }
}