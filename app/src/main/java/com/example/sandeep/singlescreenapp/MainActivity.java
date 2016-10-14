package com.example.sandeep.singlescreenapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView mImageview;
    TextView mServicesTv;
    ListView mListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageview = (ImageView) findViewById(R.id.imageview);

        mListView = (ListView) findViewById(R.id.listview);

    }
}
