package com.example.inventory.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.inventory.R;
import com.example.inventory.adapter.SectionAdapter;

public class SectionListActivity extends AppCompatActivity {

    private RecyclerView rvSections;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_list);

        rvSections.findViewById(R.id.rvSections);
        rvSections.setAdapter(new SectionAdapter(this));
        //Añadir un layout al recyclerview
        rvSections.setLayoutManager(new LinearLayoutManager(this));
    }
}
