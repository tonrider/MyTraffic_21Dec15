package com.example.korsak_c.mytraffic;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class DetailActivity extends AppCompatActivity {

    //Explicit  ประกาศตัวแปร
    private TextView titleTextView;
    private TextView detailTextView;
    private ImageView imageView;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widget
        bindWidget();

        //Show View
        showView();

    }



    private void showView() {

        //Show Title
        String strTitle = getIntent().getStringExtra("Title");
        titleTextView.setText(strTitle);

        //Show Image
        int intIcon = getIntent().getIntExtra("Image",R.drawable.traffic_01);
        imageView.setImageResource(intIcon);

        //Show Detail
        String[] strDetail = getResources().getStringArray(R.array.detail_long);
        int intIndex = getIntent().getIntExtra("Index",0);
        detailTextView.setText(strDetail[intIndex]);


    }   // showView

    private void bindWidget() {
        titleTextView = (TextView) findViewById(R.id.textView4);
        detailTextView = (TextView) findViewById(R.id.textView5);
        imageView = (ImageView) findViewById(R.id.imageView2);

    }


}
