package com.sematec.sematecandroidbasicmordad98;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class TestVideoViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_video_view);

        String address = "https://hw15.cdn.asset.aparat.com/aparat-video/7b4c5c57495d7de59c2e4c12b5f067fb16418444-144p__78386.mp4";

        VideoView vv = findViewById(R.id.vv);

        vv.setVideoURI(Uri.parse(address));
        vv.setMediaController(new MediaController(TestVideoViewActivity.this));
        vv.start();

    }
}
