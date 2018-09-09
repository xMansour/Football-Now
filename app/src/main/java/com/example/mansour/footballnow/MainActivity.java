package com.example.mansour.footballnow;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    LinearLayoutManager mLayoutManager;
    MyAdapter mRecyclerViewAdapter;
    private List<Club> mClubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        initializeData();
        initializeAdapter();


    }

    public void initializeData(){
        mClubs = new ArrayList<>();
        //mClubs.add(new Club("Manchester United", R.drawable.mu));
        //mClubs.add(new Club("Bayern", R.drawable.bayern));
        //mClubs.add(new Club("Arsenal", R.drawable.arsenal));
        mClubs.add(new Club("Real Madrid", R.drawable.rm));
        mClubs.add(new Club("Roma", R.drawable.rome));
        mClubs.add(new Club("Liverpool", R.drawable.liverpool));

        //mClubs.add(new Club("Barcelona", R.drawable.fcb));
        //mClubs.add(new Club("Chelsea", R.drawable.chelsea));
        mClubs.add(new Club("Real Madrid", R.drawable.rm));
        mClubs.add(new Club("Roma", R.drawable.rome));
        mClubs.add(new Club("Liverpool", R.drawable.liverpool));
        mClubs.add(new Club("Real Madrid", R.drawable.rm));
        mClubs.add(new Club("Roma", R.drawable.rome));
        mClubs.add(new Club("Liverpool", R.drawable.liverpool));
        mClubs.add(new Club("Real Madrid", R.drawable.rm));
        mClubs.add(new Club("Roma", R.drawable.rome));
        mClubs.add(new Club("Liverpool", R.drawable.liverpool));
        mClubs.add(new Club("Real Madrid", R.drawable.rm));
        mClubs.add(new Club("Roma", R.drawable.rome));
        mClubs.add(new Club("Liverpool", R.drawable.liverpool));
        mClubs.add(new Club("Real Madrid", R.drawable.rm));
        mClubs.add(new Club("Roma", R.drawable.rome));
        mClubs.add(new Club("Liverpool", R.drawable.liverpool));
        mClubs.add(new Club("Real Madrid", R.drawable.rm));
        mClubs.add(new Club("Roma", R.drawable.rome));
        mClubs.add(new Club("Liverpool", R.drawable.liverpool));
        mClubs.add(new Club("Real Madrid", R.drawable.rm));
        mClubs.add(new Club("Roma", R.drawable.rome));
        mClubs.add(new Club("Liverpool", R.drawable.liverpool));
        mClubs.add(new Club("Real Madrid", R.drawable.rm));
        mClubs.add(new Club("Roma", R.drawable.rome));
        mClubs.add(new Club("Liverpool", R.drawable.liverpool));
        mClubs.add(new Club("Real Madrid", R.drawable.rm));
        mClubs.add(new Club("Roma", R.drawable.rome));
        mClubs.add(new Club("Liverpool", R.drawable.liverpool));

    }
    public void initializeAdapter(){
        mRecyclerViewAdapter = new MyAdapter(mClubs);
        mRecyclerView.setAdapter(mRecyclerViewAdapter);
    }
}
