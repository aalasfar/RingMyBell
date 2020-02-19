package com.example.ringmybell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class StreamActivity extends AppCompatActivity {

    WebView browser;
    EditText link;
    Button btn_visit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stream);
        //getSupportActionBar().setTitle("Live Streaming");

        browser=(WebView) findViewById(R.id.webview);
        //link = (EditText) findViewById(R.id.editTextLink);
        //btn_visit=(Button) findViewById(R.id.btn_view);

        browser.setWebViewClient(new myWebViewClient());

        String url = "http://169.234.25.31/html/";

        browser.getSettings().setLoadsImagesAutomatically(true);
        browser.getSettings().setJavaScriptEnabled(true);

        browser.loadUrl(url);
        /*
        btn_visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = link.getText().toString();

                browser.getSettings().setLoadsImagesAutomatically(true);
                browser.getSettings().setJavaScriptEnabled(true);

                browser.loadUrl(url);
            }
        });*/
    }

    private class myWebViewClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
}


/*
<LinearLayout
        android:layout_width="445dp"
        android:layout_height="36dp"
        android:layout_weight="1"

        tools:ignore="MissingConstraints">


    </LinearLayout>

 <EditText
            android:id="@+id/editTextLink"
            android:layout_width="296dp"
            android:layout_height="61dp"
            android:layout_weight="9"
            android:hint="Enter Website" />
<Button
            android:id="@+id/btn_view"
            android:layout_width="121dp"
            android:layout_height="67dp"
            android:layout_weight="1"
            android:backgroundTint="@color/colorPrimary"
            android:text="Click"
            android:textColor="#ffffff"
            android:textSize="18sp" />


* */