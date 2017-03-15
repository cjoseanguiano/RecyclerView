package com.devix.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Cube> cubeList = new ArrayList<>();
        cubeList.add(new Cube(R.drawable.yo, "Jose Anguiano"));
        cubeList.add(new Cube(R.drawable.leon, "Leon"));
        cubeList.add(new Cube(R.drawable.photo, "photo"));
        cubeList.add(new Cube(R.drawable.tresd, "tres d"));
        cubeList.add(new Cube(R.drawable.triangulo_rectangulo, "triangulo_rectangulo"));


        recyclerView = (RecyclerView)findViewById(R.id.reciclador);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new CubeAdapter(cubeList);
        recyclerView.setAdapter(adapter);
    }
}
