package com.first.pro.pokedex;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        obj = MediaPlayer.create(this, R.raw.pokeopen);
    }


    public void startSearch(View view) {
        Intent intent = new Intent(this, SearchActivity.class);
        obj.start();
        startActivity(intent);
    }

}
