package com.anand.assignmentservices;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void DownloadFiles(View view)
    {
        Intent intent = new Intent(this, DownloadActivity.class);
        startActivity(intent);
    }

    public void CloseApplication(View view)
    {
        MainActivity.this.finish();
    }
}
