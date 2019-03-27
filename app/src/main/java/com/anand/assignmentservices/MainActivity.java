package com.anand.assignmentservices;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void DownloadFiles(View view)
    {
        CheckStoragePermission();
        Intent intent = new Intent(this, DownloadActivity.class);
        startActivity(intent);
    }

    public boolean CheckStoragePermission() {
        if (Build.VERSION.SDK_INT >= 23)
        {
                if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED)
                {
                    Log.e("Error", "You have permission");
                    return true;
                }
                else {
                Log.e("Error", "You have asked for permission");
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                return false;
                }
        }
        else {
            Log.e("Error", "You already have the permission");
            return true;
        }
    }

    public void CloseApplication(View view)
    {
        MainActivity.this.finish();
    }
}
