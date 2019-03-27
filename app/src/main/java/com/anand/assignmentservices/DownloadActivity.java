package com.anand.assignmentservices;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.support.v7.app.AppCompatActivity;

public class DownloadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);

        EditText document1 = findViewById(R.id.pdf1);
        document1.setText("https://www.cisco.com/web/about/ac79/docs/innov/IoE.pdf");

        EditText document2 = findViewById(R.id.pdf2);
        document2.setText("https://www.cisco.com/web/about/ac79/docs/innov/IoE_Economy.pdf");

        EditText document3 = findViewById(R.id.pdf3);
        document3.setText("https://www.cisco.com/web/strategy/docs/gov/everything-for-cities.pdf");

        EditText document4 = findViewById(R.id.pdf4);
        document4.setText("https://www.cisco.com/web/offer/gist_ty2_asset/Cisco_2014_ASR.pdf");

        EditText document5 = findViewById(R.id.pdf5);
        document5.setText("https://www.cisco.com/web/offer/emear/38586/images/Presentations/P3.pdf");
    }

    public void CloseApplication(View view)
    {
        this.finish();
    }

    public void BeginDownload(View view) {
        Intent intent = new Intent(getBaseContext(), ActivityIntentService.class);
        try {
            String[] urls = new String[5];
            urls[0] = "https://www.cisco.com/web/about/ac79/docs/innov/IoE.pdf";
            urls[1] = "https://www.cisco.com/web/about/ac79/docs/innov/IoE_Economy.pdf";
            urls[2] = "https://www.cisco.com/web/strategy/docs/gov/everything-for-cities.pdf";
            urls[3] = "https://www.cisco.com/web/offer/gist_ty2_asset/Cisco_2014_ASR.pdf";
            urls[4] = "https://www.cisco.com/web/offer/emear/38586/images/Presentations/P3.pdf";
            intent.putExtra("URLs", urls);
            startService(intent);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}

