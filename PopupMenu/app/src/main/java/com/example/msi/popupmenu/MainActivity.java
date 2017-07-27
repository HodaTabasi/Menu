package com.example.msi.popupmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.re1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);


        List<Game> gameList = new ArrayList<>();
        gameList.add(new Game("Code Game", 12,R.drawable.f1));
        gameList.add(new Game("Attack Game", 2,R.drawable.f2));
        gameList.add(new Game("OnLine Game", 22,R.drawable.f3));
        gameList.add(new Game("Hell Game", 33,R.drawable.f4));
        gameList.add(new Game("Girl Game", 20,R.drawable.f5));
        gameList.add(new Game("Anime Out", 2,R.drawable.f6));
        gameList.add(new Game("Anime R60", 12,R.drawable.f7));
        gameList.add(new Game("Bad Girl", 1,R.drawable.f8));
        gameList.add(new Game("Code Game", 22,R.drawable.f1));
        gameList.add(new Game("Bad Girl", 100,R.drawable.f11));


        List<twoAdapter> twoAdapters = new ArrayList<>();
        twoAdapters.add(new twoAdapter(this,gameList));
        twoAdapters.add(new twoAdapter(this,gameList));
        twoAdapters.add(new twoAdapter(this,gameList));
        twoAdapters.add(new twoAdapter(this,gameList));
        twoAdapters.add(new twoAdapter(this,gameList));
        twoAdapters.add(new twoAdapter(this,gameList));
        twoAdapters.add(new twoAdapter(this,gameList));
        twoAdapters.add(new twoAdapter(this,gameList));

        oneAdapter adapter = new oneAdapter(this,twoAdapters,R.layout.item_two_layout);
        recyclerView.setAdapter(adapter);

    }
}
