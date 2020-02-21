package com.example.mediacontrollervideoview;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView vedioView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vedioView = (VideoView) findViewById(R.id.mediaController);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.small);
                vedioView.setVideoURI(uri);
                MediaController mediaController = new MediaController(this);
                vedioView.setMediaController(mediaController);
                vedioView.start();
//        MediaController mediaController = new MediaController(MainActivity.this);
//        vedioView.setVideoPath("https://youtu.be/4ssB-Sk-Vk4");
//        mediaController.setAnchorView(vedioView);
//        vedioView.setMediaController(mediaController);
//        vedioView.start(); comment code wrong ata youtube video play korer try korechilam
    }
}
