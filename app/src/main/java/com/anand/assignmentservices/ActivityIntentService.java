package com.anand.assignmentservices;

import android.content.Intent;
import android.app.IntentService;
import android.support.annotation.Nullable;

public class ActivityIntentService extends IntentService {
    public ActivityIntentService() {
        super("ActivityIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        String[] listOfURLs = intent.getStringArrayExtra("URLs");
        UtilityClass utilityClass = new UtilityClass(getBaseContext());
        for (int i = 0; i < listOfURLs.length; i++) {
            int file = i+1;
            long downloadId = utilityClass.DownloadFiles(listOfURLs[i], "Document_" + file + ".pdf");
            try { Thread.sleep(6000); }
            catch (InterruptedException exception) { }
        }
    }
}
