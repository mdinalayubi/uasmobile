package com.pemrograman_mobile;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vidio);

        VideoView videoView = findViewById(R.id.trailer);

        // Get the video URI from the intent
        String videoUriString = getIntent().getStringExtra("VIDEO_URI");
        Uri videoUri = Uri.parse(videoUriString);

        // Set up a MediaController for controlling the video playback
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        // Set the video URI and start playing
        videoView.setVideoURI(videoUri);
        videoView.start();
    }
}
