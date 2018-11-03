package com.example.player.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        songList = (ListView) findViewById(R.id.songList);
        arrayList = new ArrayList<>();
        arrayList.add(new Music("Manchala", "Shafaqat Amanat ali", R.raw.manchala));
        arrayList.add(new Music("Kabira", "Tochi", R.raw.kabira));
        arrayList.add(new Music("Ishq Bulaava", "Sanam Puri", R.raw.ishq));
        arrayList.add(new Music("Subhan Allah", "Sreeram", R.raw.subhanallah));
        arrayList.add(new Music("Bang bang", "Ash king", R.raw.bangbang));
        arrayList.add(new Music("Titli", "Gupi Sundar", R.raw.titli));


        adapter = new CustomMusicAdapter(this, R.layout.custom_music_item, arrayList);
        songList.setAdapter(adapter);
    }
}
