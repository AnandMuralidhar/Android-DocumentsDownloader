package com.anand.assignmentservices;

import android.content.Context;
import android.net.Uri;
import android.app.DownloadManager;
import android.os.Environment;

public class UtilityClass {

    private Context context;

    public UtilityClass(Context context)
    {
        this.context = context;
    }

    public long DownloadFiles( String urlDownload, String documentName)
    {
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(urlDownload));
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, documentName);
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, documentName);
        DownloadManager downloadManager = (DownloadManager) context.getSystemService(Context.DOWNLOAD_SERVICE);
        long downloadId = downloadManager.enqueue(request);
        return downloadId;
    }
}
