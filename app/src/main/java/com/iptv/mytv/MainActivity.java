package com.iptv.mytv;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import io.vov.vitamio.widget.MediaController;
import io.vov.vitamio.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;

    private void test_2(){
       String httpLiveUrl = "http://devimages.apple.com/iphone/samples/bipbop/bipbopall.m3u8";

//        String httpLiveUrl ="rtmp://204.107.26.252:8086/live/796.high.stream";
       // String httpLiveUrl = "http://download.itcuties.com/teaser/itcuties-teaser-480.mp4";
        videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse(httpLiveUrl));
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView.requestFocus();
        videoView.start();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!io.vov.vitamio.LibsChecker.checkVitamioLibs(this))
            return;
        setContentView(R.layout.activity_main);
        test_2();
    }
}
