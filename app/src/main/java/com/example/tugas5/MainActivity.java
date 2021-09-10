package com.example.tugas5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private mahasiswaadapter mahasiswaadapter;
    private ArrayList<mahasiswa> mahasiswaArrayList

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recycleview);

        mahasiswaadapter = new mahasiswaadapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mahasiswaadapter);



    }
    public void getData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new mahasiswa("53418243","Ikhsan Mutaqin","3IA15"));
        mahasiswaArrayList.add(new mahasiswa("53418244","Yudha Permana","3IA15"));
        mahasiswaArrayList.add(new mahasiswa("53418241","Domoni","3IA15"));
        mahasiswaArrayList.add(new mahasiswa("53418249","Mutaqin","3IA15"));
        mahasiswaArrayList.add(new mahasiswa("53418240","Yudhi","3IA15"));
        mahasiswaArrayList.add(new mahasiswa("53418244","Lala","3IA15"));

    }
}