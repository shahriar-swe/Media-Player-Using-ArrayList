package com.shahriarmomen.mediaplayerusingarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Music> arrayList;
    private MusicAdapter adapter;
    private ListView songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        songList = (ListView) findViewById(R.id.songList);
        arrayList = new ArrayList<>();

        arrayList.add(new Music("Dholave", "Don Nguyễn", R.raw.dhola_ve));
        arrayList.add(new Music("song 2", "badsha", R.raw.main_kaun_hoon));
        //arrayList.add(new Music("Lời anh chưa thể nói", "Hàn Khởi", R.raw.loi_anh_chua_the_noi));
        //arrayList.add(new Music("Tan", "Lương Minh Trang", R.raw.tan));

        adapter = new MusicAdapter(this, R.layout.songs_list_layout, arrayList);
        songList.setAdapter(adapter);

    }
}