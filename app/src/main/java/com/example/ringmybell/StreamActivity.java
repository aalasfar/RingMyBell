package com.example.ringmybell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StreamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stream);
        getSupportActionBar().setTitle("Live Streaming");

    }
}
