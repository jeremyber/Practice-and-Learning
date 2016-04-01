package com.jeremyber.youtubeplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

public class StandaloneActivity extends AppCompatActivity {

    private String GOOGLE_API_KEY = "AIzaSyBAuqdXqUDBb7MPyEnk3rlNgKZ9sRIPC_I";
    private String YOUTUBE_VIDEO_ID = "IzDwa2y5kDs";
    private String YOUTUBE_PLAYLIST_ID="TBA";
    private Button btnPlayVideo;
    private Button btnPlaylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

}
